package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.Cat;
import com.example.demo.services.CatService;

@RestController
@RequestMapping("api/cats")
public class CatController {

  @Autowired
  private CatService catService;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void addCat(@RequestBody Cat cat) {
    catService.addCat(cat);
  }

  @GetMapping
  public CatService getCatService() {
    return catService;
  }
}
