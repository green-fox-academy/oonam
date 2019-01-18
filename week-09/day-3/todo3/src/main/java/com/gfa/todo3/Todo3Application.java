package com.gfa.todo3;

import com.gfa.todo3.Model.Todo;
import com.gfa.todo3.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todo3Application implements CommandLineRunner {

  TodoService service;

  @Autowired
  public Todo3Application(TodoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(Todo3Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("Buy milk 1"));
    service.addTodo(new Todo("Buy milk 2", true, false));
    service.addTodo(new Todo("Buy milk 3", true, true));
  }
}

