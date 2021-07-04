package com.example.bookstore.repository;

import com.example.bookstore.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Authors extends JpaRepository<Author, Long> {

}
