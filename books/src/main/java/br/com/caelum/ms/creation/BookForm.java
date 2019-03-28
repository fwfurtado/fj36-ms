package br.com.caelum.ms.creation;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;

class BookForm {

    @NotBlank
    private String title;

    private List<Long> authors = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public List<Long> getAuthors() {
        return authors;
    }
}
