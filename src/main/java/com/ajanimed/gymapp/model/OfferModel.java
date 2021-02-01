package com.ajanimed.gymapp.model;

import javax.persistence.*;

@Entity(name = "offer")
public class OfferModel {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer duration;
    private String monthsToPayNum;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getMonthsToPayNum() {
        return monthsToPayNum;
    }

    public void setMonthsToPayNum(String monthsToPayNum) {
        this.monthsToPayNum = monthsToPayNum;
    }
}
