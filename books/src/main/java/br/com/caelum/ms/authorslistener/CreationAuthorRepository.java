package br.com.caelum.ms.authorslistener;

import br.com.caelum.ms.shared.Author;
import org.springframework.data.repository.Repository;

interface CreationAuthorRepository extends Repository<Author, Long> {

    void save(Author author);

}
