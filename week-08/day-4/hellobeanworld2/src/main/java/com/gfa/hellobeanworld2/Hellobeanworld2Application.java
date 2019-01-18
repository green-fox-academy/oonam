package com.gfa.hellobeanworld2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Hellobeanworld2Application implements CommandLineRunner {

  MyColor color;

  @Autowired
  public Hellobeanworld2Application(MyColor color) {
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(Hellobeanworld2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    color.printColor();
  }
}

