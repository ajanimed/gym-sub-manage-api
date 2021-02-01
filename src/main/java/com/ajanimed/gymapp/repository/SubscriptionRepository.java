package com.ajanimed.gymapp.repository;

import com.ajanimed.gymapp.model.ClientModel;
import com.ajanimed.gymapp.model.SubscriptionModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
public interface SubscriptionRepository extends CrudRepository<SubscriptionModel, Integer> {
    public static final String CONDITION = " WHERE s.endDate< :date";

    @Query("SELECT s FROM subscription s INNER JOIN " +
            "client c ON s.client.id=c.id INNER JOIN " +
            "offer o ON s.offer.id=o.id"+CONDITION)
    public List<SubscriptionModel> getExpiredClients(@Param("date") LocalDate date);
}