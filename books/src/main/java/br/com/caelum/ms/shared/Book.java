package br.com.caelum.ms.shared;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;

@Entity
@NamedEntityGraph( name = "authors-graph", attributeNodes = @NamedAttributeNode("authors"))
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    @ManyToMany
    private List<Author> authors;

    /**
     * @deprecated frameworks only
     */
    @Deprecated
    private Book() { }

    public Book(String title, List<Author> authors) {
        this.title = title;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
