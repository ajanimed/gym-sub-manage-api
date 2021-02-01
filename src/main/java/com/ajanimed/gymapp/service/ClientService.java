package com.ajanimed.gymapp.service;

import com.ajanimed.gymapp.model.ClientModel;
import com.ajanimed.gymapp.model.SubscriptionModel;
import com.ajanimed.gymapp.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ajanimed.gymapp.repository.ClientRepository;
import javax.transaction.Transactional;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    SubscriptionRepository subscriptionRepository;

    public Iterable<ClientModel> list(){
        return clientRepository.findAll();
    }

    public Optional<ClientModel> getClientById(int id){
        return clientRepository.findById(id);
    }

    public List<SubscriptionModel> getExpiredClients() throws ParseException {

        return subscriptionRepository.getExpiredClients(LocalDate.now());
    }

    public void addNewClient(ClientModel client){
        clientRepository.save(client);
    }
}
