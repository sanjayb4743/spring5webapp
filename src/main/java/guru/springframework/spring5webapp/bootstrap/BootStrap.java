package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

   @Autowired
    public AuthorRepository authorRepository;
   @Autowired
   public BookRepository bookRepository;
    @Override
    public void run(String... args) throws Exception {
     Author eric=new Author("Eric","Hoffman");
     Book book1=new Book("Java","123244");
        eric.getBooksAuthored().add(book1);
        authorRepository.save(eric);
        bookRepository.save(book1);
        Author rj=new Author("Rod","Johnson");
        Book book2=new Book("JavaJee","1232442");
        eric.getBooksAuthored().add(book2);
        authorRepository.save(rj);
        bookRepository.save(book2);

        System.out.println(authorRepository.count());




    }
}
