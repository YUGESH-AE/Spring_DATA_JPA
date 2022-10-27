package com.example.spring_data_jpa.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @Column(name = "phone_no")
    private Long phoneNo;
    private String name;
    private Integer age;
    private String gender;
    private String address;
    private Integer planId;
}
