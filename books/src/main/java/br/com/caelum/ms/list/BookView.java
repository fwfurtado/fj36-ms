package br.com.caelum.ms.list;

import br.com.caelum.ms.shared.Author;
import br.com.caelum.ms.shared.Book;
import java.util.List;
import java.util.stream.Collectors;

class BookView {

    private Long id;
    private String title;
    private List<String> authors;


    BookView(Book book) {
        id = book.getId();
        title = book.getTitle();
        this.authors = book.getAuthors().stream().map(Author::getName).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }
}
