package br.com.caelum.ms.authorslistener;

import static br.com.caelum.ms.configuration.EventDrivenConfiguration.AUTHORS_CHANNEL;

import br.com.caelum.ms.shared.Author;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class AuthorListener {

    private final CreationAuthorRepository repository;
    private final Converter<CreatedAuthorEvent, Author> conveter;

    AuthorListener(CreationAuthorRepository repository, Converter<CreatedAuthorEvent, Author> conveter) {
        this.repository = repository;
        this.conveter = conveter;
    }

    @StreamListener(AUTHORS_CHANNEL)
    void handle(CreatedAuthorEvent event) {
        Author author = conveter.convert(event);

        repository.save(author);
    }

}
