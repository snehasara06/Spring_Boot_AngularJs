package com.kgisl.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgisl.springbootdemo.entity.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
