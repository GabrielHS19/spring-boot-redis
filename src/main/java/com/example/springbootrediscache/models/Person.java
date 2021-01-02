package com.example.springbootrediscache.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="person")
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=1, max=20)
    private String firstname;
    
    @Size(min=1, max=20)
    private String lastname;
    
    private int age;
    
    @Size(min=1, max=500)
    private String description;
    
    @Size(min=1, max=20)
    private String city;
    
    @Size(min=1, max=20)
    private String country;
    
    @Size(min=1, max=50)
    private String street;
    
    @Size(min=1, max=100)
    private String weather_condition;

    public Person() {
    }
    
    public Person(Long id, String firstname, String lastname, int age, String description,
        String city, String country, String street, String weather_condition) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.description = description;
        this.city = city;
        this.country = country;
        this.street = street;
        this.weather_condition = weather_condition;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWeather_condition() {
        return weather_condition;
    }

    public void setWeather_condition(String weather_condition) {
        this.weather_condition = weather_condition;
    } 
    
}