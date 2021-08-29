package com.example.bookstore.resource;

import com.example.bookstore.model.Book;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
@Api(value="/books", tags = "books")
public class BooksResource {

    private List<Book> books = new ArrayList<>();
    Book book = new Book();

    public BooksResource() {
        book.setId(1);
        book.setName("Harry Potter and the Chamber of Secrets");
        book.setPrice(10.0);
        books.add(book);
        book = new Book();
        book.setId(2);
        book.setName("The Lord of the Rings");
        book.setPrice(15.0);
        books.add(book);
        book = new Book();
        book.setId(3);
        book.setName("O Monge e o Executivo");
        book.setPrice(7.0);
        books.add(book);
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @GetMapping
    public List<Book> getBooks(){
        return books;
    }

}
