package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

   @Autowired
    public AuthorRepository authorRepository;
   @Autowired
   public BookRepository bookRepository;
   @Autowired
   public PublisherRepository publisherRepository;
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
        Publisher newPub=new Publisher();
        newPub.setName("Sanjay Co.");
        newPub.setAddressLine1("Sanjay Street");
        newPub.setState("SJ");
        newPub.setCity("SanjayCity");
        newPub.setZipCode("55555");
        publisherRepository.save(newPub);
        System.out.println("Number of publishers : "+publisherRepository.count());
        System.out.println("Number of Authors : " +authorRepository.count());




    }
}
