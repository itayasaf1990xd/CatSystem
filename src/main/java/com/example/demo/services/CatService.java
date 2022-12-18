package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Cat;
import com.example.demo.repositories.CatRepo;

@Service
@Transactional
public class CatService {
  @Autowired
  private CatRepo catRepo;

  public CatService() {
    super();
  }

  public CatRepo getCatRepo() {
    return catRepo;
  }

  public void setCatRepo(CatRepo catRepo) {
    this.catRepo = catRepo;
  }

  public void addCat(Cat cat) {
    catRepo.save(cat);
  }

  public List<Cat> getAllCats() {
    return catRepo.findAll();
  }
}
