package com.gfa.listingtodos;

import com.gfa.listingtodos.Model.Todo;
import com.gfa.listingtodos.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

  TodoService service;

  @Autowired
  public ListingtodosApplication(TodoService service) {
    this.service = service;
  }

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    service.addTodo(new Todo("Buy milk1"));
    service.addTodo(new Todo("Buy milk2"));
    service.addTodo(new Todo("Buy milk3"));
    service.addTodo(new Todo("Buy milk4"));
  }
}
