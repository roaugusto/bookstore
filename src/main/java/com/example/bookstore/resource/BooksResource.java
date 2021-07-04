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
