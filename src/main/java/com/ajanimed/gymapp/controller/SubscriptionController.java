package com.ajanimed.gymapp.controller;

import com.ajanimed.gymapp.model.SubscriptionModel;
import com.ajanimed.gymapp.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("subscription")
@RestController
public class SubscriptionController {
    @Autowired
    SubscriptionRepository subscriptionRepository;

    @GetMapping("/list")
    public Iterable<SubscriptionModel> list(){
        return subscriptionRepository.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody SubscriptionModel sub){
        subscriptionRepository.save(sub);
    }

    @PostMapping("/delete/{id}")
    public void delete(Integer id){
        subscriptionRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void update(SubscriptionModel sub){
        subscriptionRepository.save(sub);
    }
}