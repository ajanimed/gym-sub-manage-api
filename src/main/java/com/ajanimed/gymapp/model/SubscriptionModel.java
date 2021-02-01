package com.ajanimed.gymapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "subscription")
public class SubscriptionModel {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne(cascade = CascadeType.MERGE)
    private ClientModel client;
    @ManyToOne(cascade = CascadeType.MERGE)
    private OfferModel offer;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate startDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate endDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public OfferModel getOffer() {
        return offer;
    }

    public void setOffer(OfferModel offer) {
        this.offer = offer;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
