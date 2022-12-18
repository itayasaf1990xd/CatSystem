package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cat;

public interface CatRepo extends JpaRepository<Cat, Integer> {

}
