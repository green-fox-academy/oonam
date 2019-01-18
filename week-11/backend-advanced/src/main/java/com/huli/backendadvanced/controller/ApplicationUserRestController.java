package com.huli.backendadvanced.controller;

import com.huli.backendadvanced.model.ApplicationUser;
import com.huli.backendadvanced.service.ApplicationUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class ApplicationUserRestController {

  private ApplicationUserServiceImpl service;
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Autowired
  public ApplicationUserRestController(ApplicationUserServiceImpl service, BCryptPasswordEncoder bCryptPasswordEncoder) {
    this.service = service;
    this.bCryptPasswordEncoder = bCryptPasswordEncoder;
  }

  @PostMapping("/sign-up")
  public void signUp(@RequestBody ApplicationUser user) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    service.addUser(user);
  }
}
