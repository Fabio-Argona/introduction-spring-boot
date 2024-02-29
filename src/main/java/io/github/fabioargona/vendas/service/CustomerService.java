package io.github.fabioargona.vendas.service;

import io.github.fabioargona.vendas.model.Customer;
import io.github.fabioargona.vendas.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    private CustomerRepository repository;

    public CustomerService( CustomerRepository repository){
        this.repository = repository;
    }
    public void saveCustomer(Customer customer){
        validateCustomer(customer);
        this.repository.persist(customer);
    }

    public void validateCustomer(Customer customer){

    }

}
