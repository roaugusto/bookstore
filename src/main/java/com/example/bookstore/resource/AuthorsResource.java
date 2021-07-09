package com.example.bookstore.resource;

import com.example.bookstore.model.Author;
import com.example.bookstore.model.Client;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/authors")
@Api(value="/authors", tags = "authors")
public class AuthorsResource {

    private List<Author> authors = new ArrayList<>();

    Author author = new Author();

    public AuthorsResource() {
        author.setId(1);
        author.setName("J. K. Rowling");
        authors.add(author);
        author = new Author();
        author.setId(2);
        author.setName("J. R. R. Tolkien");
        authors.add(author);
        author = new Author();
        author.setId(3);
        author.setName("James C. Hunter");
        authors.add(author);
    }

    @PostMapping
    public Author addAuthor(@RequestBody Author author) {
        authors.add(author);
        return author;
    }

    @GetMapping
    public List<Author> getAuthors(){
        return authors;
    }

}
