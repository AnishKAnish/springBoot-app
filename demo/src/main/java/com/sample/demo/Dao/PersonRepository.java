package com.sample.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
