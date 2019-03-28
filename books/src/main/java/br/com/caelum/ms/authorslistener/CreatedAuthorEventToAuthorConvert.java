package br.com.caelum.ms.authorslistener;

import br.com.caelum.ms.shared.Author;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class CreatedAuthorEventToAuthorConvert implements Converter<CreatedAuthorEvent, Author> {

    @Override
    public Author convert(CreatedAuthorEvent source) {
        return new Author(source.getId(), source.getName());
    }
}
