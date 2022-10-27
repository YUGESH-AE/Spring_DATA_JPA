//package com.example.spring_data_jpa.repository;
//
//import com.example.spring_data_jpa.entity.Customer;
//import org.springframework.dao.DataAccessException;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceUnit;
//import javax.persistence.Query;
//import java.util.List;
//
//@SuppressWarnings("all")
//@Repository
//public class CustomerRepositoryORM {
//
//    private EntityManagerFactory entityManagerFactory;
//
//    @PersistenceUnit
//    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public void insert(Customer customer){
//        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(customer);
//        entityManager.getTransaction().commit();
//    }
//
//    public int remove(Long phoneNumber){
//        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        int result=0;
//        try{
//            Customer cust=entityManager.find(Customer.class,phoneNumber);
//            entityManager.remove(cust);
//            result=1;
//            entityManager.getTransaction().commit();
//        }catch (DataAccessException e){
//            entityManager.getTransaction().rollback();
//        }
//        entityManager.close();
//        return result;
//
//    }
//
//    public List<Customer>getAll(){
//        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
//        Query query=entityManager.createQuery("Select c from Customer c");
//        return (List<Customer>) query.getResultList();
//    }
//
//    public void update(Long phoneNumber,String address){
//        EntityManager entityManager=this.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        Customer cust=entityManager.find(Customer.class,phoneNumber);
//        cust.setAddress(address);
//        entityManager.getTransaction().commit();
//    }
//}
