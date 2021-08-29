package com.example.bookstore.resource;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.model.Author;

import io.swagger.annotations.Api;
import springfox.documentation.RequestHandler;

@RestController
@RequestMapping("/authors")
@Api(value="/authors", tags = "authors")
public class AuthorsResource {

	private static final Logger log = LoggerFactory.getLogger(RequestHandler.class);
	
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
    public List<Author> getAuthors(HttpServletRequest request){
    	
    	log.info("Port: " + request.getServerPort());
    	
        return authors;
    }

}
