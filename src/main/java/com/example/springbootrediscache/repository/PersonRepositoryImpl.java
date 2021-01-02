package com.example.springbootrediscache.repository;

import com.example.springbootrediscache.models.Person;
import java.util.Map;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class PersonRepositoryImpl implements PersonRepository {

    private RedisTemplate<Long, Person> redisTemplate;

    private HashOperations hashOperations;

    public PersonRepositoryImpl(RedisTemplate<Long, Person> redisTemplate) {
        this.redisTemplate = redisTemplate;
        hashOperations = redisTemplate.opsForHash();
    }
    @Override
    public void save(Person person) {
        hashOperations.put("PERSON",person.getId(),person);
    }
    @Override
    public Map<Long, Person> findAll() {
        return hashOperations.entries("PERSON");
    }
    @Override
    public Person findById(Long id) {
        return (Person)hashOperations.get("PERSON",id);
    }
    @Override
    public void update(Person person){
        hashOperations.delete("PERSON");
        save(person);
    }
    @Override
    public void delete(Long id){
        hashOperations.delete("PERSON", id);
    }

}