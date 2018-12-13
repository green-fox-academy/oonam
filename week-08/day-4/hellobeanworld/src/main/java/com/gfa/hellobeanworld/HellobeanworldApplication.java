package com.gfa.hellobeanworld;

import com.gfa.hellobeanworld.models.MyColor;
import com.gfa.hellobeanworld.services.Printer;
import com.gfa.hellobeanworld.services.RedColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  @Autowired
  MyColor color;

  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    color.printColor();
  }
}

