package com.sample.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.Dao.PersonRepository;
import com.sample.demo.model.Person;

@RestController
public class PersonController {
    
    @Autowired
    PersonRepository repo;

    @PostMapping("/savePerson")
    public String savePerson(@RequestBody Person person){
        repo.save(person);
        return "created sucess";
    }

    @GetMapping("/viewPerson")
    public List<Person> getPerson(){
        return repo.findAll();
    }

    @GetMapping("/viewPersonById{id}")
    public Optional<Person> getPersonById(@PathVariable Integer id){
        return repo.findById(id);
    }



}
