package com.gfa.todosql;

import com.gfa.todosql.Model.Todo;
import com.gfa.todosql.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqlApplication implements CommandLineRunner {

  TodoService service;

  @Autowired
  public TodosqlApplication(TodoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodosqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("Buy milk1"));
    service.addTodo(new Todo("Buy milk2"));
    service.addTodo(new Todo("Buy milk3"));
    service.addTodo(new Todo("Buy milk4"));
  }
}

