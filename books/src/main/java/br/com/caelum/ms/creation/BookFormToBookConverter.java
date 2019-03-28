package br.com.caelum.ms.creation;

import br.com.caelum.ms.shared.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class BookFormToBookConverter implements Converter<BookForm, Book> {

    private final ListAuthorRepository repository;

    BookFormToBookConverter(ListAuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book convert(BookForm source) {
        return new Book(source.getTitle(), repository.findAllById(source.getAuthors()));
    }
}
