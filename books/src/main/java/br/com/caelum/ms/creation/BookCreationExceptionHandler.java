package br.com.caelum.ms.creation;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = BookCreationController.class)
class BookCreationExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    ResponseEntity<?> handle(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();

        System.out.println(result);

        return ResponseEntity.badRequest()
                .body("Deu ruim!");
    }

}
