package br.com.caelum.ms.list;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

import br.com.caelum.ms.AuthorsController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@AuthorsController
class ListAuthorController {

    private final ListAuthorRepository repository;

    ListAuthorController(ListAuthorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("{id}")
    ResponseEntity<?> show(@PathVariable Long id) {
        return repository.findById(id).map(ok()::body).orElseGet(notFound()::build);
    }
}
