package com.huli.backendadvanced.service;

import com.huli.backendadvanced.model.ApplicationUser;
import com.huli.backendadvanced.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService{

  ApplicationUserRepository repository;

  @Autowired
  public ApplicationUserServiceImpl(ApplicationUserRepository repository) {
    this.repository = repository;
  }

  @Override
  public void addUser(ApplicationUser applicationUser) {
    repository.save(applicationUser);
  }
}
