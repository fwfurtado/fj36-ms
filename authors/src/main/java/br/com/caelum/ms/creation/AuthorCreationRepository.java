package br.com.caelum.ms.creation;

import br.com.caelum.ms.shared.Author;
import org.springframework.data.repository.Repository;

interface AuthorCreationRepository extends Repository<Author, Long> {

    void save(Author author);
}
