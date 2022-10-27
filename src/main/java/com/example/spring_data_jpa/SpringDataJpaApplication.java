package com.example.spring_data_jpa;

import com.example.spring_data_jpa.entity.Customer;
import com.example.spring_data_jpa.service.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    private static Logger logger= LogManager.getLogger(SpringDataJpaApplication.class);
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Autowired
    CustomerService customerService;


    @Override
    public void run(String... args) throws Exception {
        Customer customer1= new Customer(7022713754L, "Adam", 27, "M", "Chicago", 1);
        Customer customer2= new Customer(7022713744L, "Susan", 27, "F", "Alberta", 2);
        Customer customer3= new Customer(7022713722L, "Lucy", 27, "F", "MUMBAI", 3);

        //invoke service layer method to insert Customer
//        customerService.insert(customer1);
//        customerService.insert(customer2);
//        customerService.insert(customer3);
//        logger.info("Records are successfully added..");

//        logger.info("Enter the phone Number of the Customer which has to be deleted.");
//        Long phoneNo = scanner.nextLong();
//        // Invoking Service layer method to remove Customer details from
//        // Customer table
//        int i=customerService.remove(phoneNo);
//        if(i==1){
//            logger.info("Record Deleted");
//        }
//        else {
//            logger.info("Record Not Found");
//        }

//        //invoke service layer to get all customer
//        List<Customer>customerList=customerService.getAll();
//        for(Customer c:customerList){
//            logger.info(c);
//        }

//        //invoke service layer to update a customer
//        logger.info("Enter the phone number of customer to be updated");
//        Long phone3=scanner.nextLong();
//        logger.info("Enter the address");
//        String address=scanner.next();
//        customerService.update(phone3,address);
//        logger.info("Record updated successfully");

//        //invoke service layer to get one customer
//        logger.info("Enter the phone number of customer ");
//        Long phone4=scanner.nextLong();
//        logger.info(customerService.getCustomer(phone4));
//
//        scanner.close();

    }
}
