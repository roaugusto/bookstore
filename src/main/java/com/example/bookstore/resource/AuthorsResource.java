package com.example.bookstore.resource;

import com.example.bookstore.model.Author;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/authors")
@Api(value="/authors", tags = "authors")
public class AuthorsResource {

    private List<Author> authors = new ArrayList<>();

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
