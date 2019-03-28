package br.com.caelum.ms.creation;

import br.com.caelum.ms.shared.Author;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class AuthorFormToAuthorConverter implements Converter<AuthorForm, Author> {

    @Override
    public Author convert(AuthorForm source) {
        return new Author(source.getName());
    }
}
