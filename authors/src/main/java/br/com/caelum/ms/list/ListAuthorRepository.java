package br.com.caelum.ms.list;

import br.com.caelum.ms.shared.Author;
import java.util.Optional;
import org.springframework.data.repository.Repository;

interface ListAuthorRepository extends Repository<Author, Long> {

    Optional<Author> findById(Long id);
}
