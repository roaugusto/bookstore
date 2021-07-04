package com.example.bookstore.resource;

import com.example.bookstore.model.Client;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clients")
@Api(value="/clients", tags = "clients")
public class ClientsResource {

    private List<Client> clients = new ArrayList<>();

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        clients.add(client);
        return client;
    }

    @GetMapping
    public List<Client> getClients(){
        return clients;
    }

}
