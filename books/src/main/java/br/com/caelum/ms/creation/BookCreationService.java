package br.com.caelum.ms.creation;

import br.com.caelum.ms.shared.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
class BookCreationService {

    private final BookCreationRepository repository;
    private final Converter<BookForm, Book> converter;

    BookCreationService(BookCreationRepository repository, Converter<BookForm, Book> converter) {
        this.repository = repository;
        this.converter = converter;
    }

    Long saveFrom(BookForm form) {

        Book book = converter.convert(form);

        repository.save(book);

        return book.getId();
    }
}
