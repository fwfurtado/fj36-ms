package br.com.caelum.ms.shared;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    private Long id;

    private String name;

    @Deprecated
    private Author() { }

    public Author(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
