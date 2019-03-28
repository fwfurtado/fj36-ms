package br.com.caelum.ms.shared;

public class CreatedAuthor {
    private Long id;
    private String name;

    public CreatedAuthor(Author author) {
        this.id = author.getId();
        this.name = author.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
