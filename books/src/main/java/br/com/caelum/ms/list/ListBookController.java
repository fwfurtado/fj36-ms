package br.com.caelum.ms.list;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ListBookController {

    private final ListBookRepository repository;

    ListBookController(ListBookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("{id}")
    ResponseEntity<BookView> show(@PathVariable Long id) {
        return repository.findById(id)
                            .map(BookView::new)
                            .map(ok()::body)
                                .orElseGet(notFound()::build);
    }
}
