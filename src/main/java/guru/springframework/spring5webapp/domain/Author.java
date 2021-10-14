package guru.springframework.spring5webapp.domain;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Author {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
   @ManyToMany(mappedBy = "authors")
    private Set<Book> booksAuthored=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
       }

    public Author() {
    }
}
