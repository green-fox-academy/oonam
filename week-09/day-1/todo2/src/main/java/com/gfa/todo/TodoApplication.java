package com.gfa.todo;

import com.gfa.todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  TodoService service;

  @Autowired
  public TodoApplication(TodoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }


  @Override
  public void run(String... args) throws Exception {

  }
}

