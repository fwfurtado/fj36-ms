package br.com.caelum.ms.list;

import br.com.caelum.ms.shared.Book;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.Repository;

interface ListBookRepository extends Repository<Book, Long> {

    @EntityGraph("authors-graph")
    Optional<Book> findById(Long id);
}
