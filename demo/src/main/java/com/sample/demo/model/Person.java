package com.sample.demo.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
public class Person implements Serializable{
    @Id
    int id;
    String name;
    String dept;
    Date joinedDate;
    Double salary;
}
