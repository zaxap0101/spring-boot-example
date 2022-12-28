package com.azazel.customerrepository;

import com.azazel.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//Второй тип данных - идентификатор клиента
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
