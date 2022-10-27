package com.example.spring_data_jpa.service;

import com.example.spring_data_jpa.entity.Customer;
import com.example.spring_data_jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

//    @Autowired
//    CustomerRepositoryORM customerRepository;

    @Autowired
    CustomerRepository customerRepository;

    public void insert(Customer customer){
        customerRepository.saveAndFlush(customer);
    }

    public int remove(Long phoneNo){
        Optional<Customer>optionalCustomer=customerRepository.findById(phoneNo);
        if(optionalCustomer.isPresent()){
             customerRepository.deleteById(phoneNo);
             return 1;
        }
        return 0;
    }

    public List<Customer>getAll(){
        return customerRepository.findAll();
    }

    public void update(Long phoneNo, String address){
        Optional<Customer>optionalCustomer=customerRepository.findById(phoneNo);
        if(optionalCustomer.isPresent()){
            Customer customer=optionalCustomer.get();
            customer.setAddress(address);
            customerRepository.save(customer);
        }
    }

    public Customer getCustomer(Long phoneNo) {
        Optional<Customer> optionalCustomer = customerRepository.findById(phoneNo);
        Customer cus = null;
        if (optionalCustomer.isPresent()) {
            cus = optionalCustomer.get();

        }
        return cus;

    }


}
