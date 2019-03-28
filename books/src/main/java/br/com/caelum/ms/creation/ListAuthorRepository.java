package br.com.caelum.ms.creation;

import br.com.caelum.ms.shared.Author;
import java.util.List;
import org.springframework.data.repository.Repository;

interface ListAuthorRepository extends Repository<Author, Long> {

    List<Author> findAllById(List<Long> id);
}
