package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    private List<Customer> listOfCustomers = new ArrayList<Customer>();
    
    public InMemoryCustomerRepository(){
        listOfCustomers.add(new Customer("aaa1", "imie1", "adres1", 1));
        listOfCustomers.add(new Customer("aaa2", "imie2", "adres2", 2));
        listOfCustomers.add(new Customer("aaa3", "imie3", "adres3", 3));
        listOfCustomers.add(new Customer("aaa4", "imie4", "adres4", 4));
        listOfCustomers.add(new Customer("aaa5", "imie5", "adres5", 5));
    }
    
    public List<Customer> getAllCustomers() {
        return this.listOfCustomers;
    }
    
}
