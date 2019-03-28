package br.com.caelum.ms.creation;

import br.com.caelum.ms.shared.Book;
import org.springframework.data.repository.Repository;

interface BookCreationRepository extends Repository<Book, Long> {

    void save(Book book);
}
