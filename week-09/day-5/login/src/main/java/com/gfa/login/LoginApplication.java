package com.gfa.login;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(LoginApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}

