package com.ajanimed.gymapp.repository;

import com.ajanimed.gymapp.model.ClientModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Transactional
public interface ClientRepository extends CrudRepository<ClientModel, Integer> {
}
