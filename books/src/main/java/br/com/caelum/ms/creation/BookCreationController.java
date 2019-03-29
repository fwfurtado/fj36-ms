package br.com.caelum.ms.creation;

import static org.springframework.http.ResponseEntity.created;

import java.net.URI;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("books")
class BookCreationController {

    private final BookCreationService service;

    BookCreationController(BookCreationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid BookForm form, ServletUriComponentsBuilder uriBuilder) {
        Long id = service.saveFrom(form);

        URI uri = uriBuilder.path("{id}").build(id);

        return created(uri).build();
    }
}
