package com.ajanimed.gymapp.controller;

import com.ajanimed.gymapp.model.OfferModel;
import com.ajanimed.gymapp.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("offer")
@RestController
public class OfferController {
    @Autowired
    OfferRepository offerRepository;

    @GetMapping("/list")
    public Iterable<OfferModel> list(){
        return offerRepository.findAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody OfferModel offer){
        offerRepository.save(offer);
    }

    @PostMapping("/delete/{id}")
    public void delete(Integer id){
        offerRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void update(OfferModel offer){
        offerRepository.save(offer);
    }
}
