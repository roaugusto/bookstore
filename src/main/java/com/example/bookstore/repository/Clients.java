package com.example.bookstore.repository;

import com.example.bookstore.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clients extends JpaRepository<Client, Long> {

}
