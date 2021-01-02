package com.example.springbootrediscache.controllers;

import com.example.springbootrediscache.models.Person;
import com.example.springbootrediscache.repository.PersonRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/rest/person")
public class PersonController{

    @Autowired
    private PersonRepository personRepository;

    public PersonController(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping("/all")
    public Map<Long, Person> GetAll(){
        return personRepository.findAll();
    }
    @PostMapping("/add")
    public Person add(@RequestBody Person person){
        personRepository.save(person);
        return personRepository.findById(person.getId());
    }
    @PostMapping("/update")
    public Person update(@RequestBody Person person){
        personRepository.update(person);
        return personRepository.findById(person.getId());
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Long id){
        personRepository.delete(id);
        return true;
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id){
        return personRepository.findById(id);
    }
}
