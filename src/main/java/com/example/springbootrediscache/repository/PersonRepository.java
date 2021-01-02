package com.example.springbootrediscache.repository;

import com.example.springbootrediscache.models.Person;
import java.util.Map;

public interface PersonRepository {
    void save(Person person);
    Map<Long, Person> findAll();
    Person findById(Long id);
    void update(Person person);
    void delete(Long id);
}