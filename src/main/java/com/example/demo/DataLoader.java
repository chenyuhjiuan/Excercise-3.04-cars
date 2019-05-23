package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner{
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car("2016", "Acura", "ILX");
        repository.save(car);
        car = new Car("2000", "Toyota", "Corolla");
        repository.save(car);
        car = new Car("2009", "Ford", "Ranger");
        repository.save(car);
    }
}
