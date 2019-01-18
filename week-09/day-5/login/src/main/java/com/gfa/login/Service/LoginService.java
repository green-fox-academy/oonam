package com.gfa.login.Service;

import com.gfa.login.Model.Login;
import com.gfa.login.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

  LoginRepository repository;

  @Autowired
  public LoginService(LoginRepository repository) {
    this.repository = repository;
  }

  public void addLogin(Login login) {
    if (login != null) {
      repository.save(login);
    }
  }
}
