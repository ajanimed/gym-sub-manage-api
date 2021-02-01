package com.ajanimed.gymapp.controller;

import com.ajanimed.gymapp.model.ClientModel;
import com.ajanimed.gymapp.model.SubscriptionModel;
import com.ajanimed.gymapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RequestMapping("client")
@RestController
public class ClientController {
    @Autowired
    ClientService clientService;

    @GetMapping("/list")
    public Iterable<ClientModel>  list(){
        return clientService.list();
    }

    @GetMapping("/{id}")
    public Optional<ClientModel> getClientById(@PathVariable("id")  Integer id){
        return clientService.getClientById(id);
    }

    @GetMapping("/expired")
    public List<SubscriptionModel> getExpiredClients() throws ParseException {
        return clientService.getExpiredClients();
    }

    @PostMapping("/add")
    public void addNewClient(@RequestBody  ClientModel client){
        clientService.addNewClient(client);
    }
}
