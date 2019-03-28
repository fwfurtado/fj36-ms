package br.com.caelum.ms.creation;

import static br.com.caelum.ms.configuration.EventDrivenConfigurations.AUTHOR_CHANNEL;

import br.com.caelum.ms.shared.Author;
import br.com.caelum.ms.shared.CreatedAuthor;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.core.convert.converter.Converter;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
class AuthorCreationService {

    private final Converter<AuthorForm, Author> converter;
    private final AuthorCreationRepository repository;
    private final MessageChannel channel;

    AuthorCreationService(Converter<AuthorForm, Author> converter, AuthorCreationRepository repository, @Output(AUTHOR_CHANNEL) MessageChannel channel) {
        this.converter = converter;
        this.repository = repository;
        this.channel = channel;
    }

    Long saveFrom(AuthorForm form) {
        Author author = converter.convert(form);

        repository.save(author);

        CreatedAuthor event = new CreatedAuthor(author);

        Message<CreatedAuthor> message = MessageBuilder.withPayload(event).build();

        channel.send(message);

        return author.getId();
    }
}
