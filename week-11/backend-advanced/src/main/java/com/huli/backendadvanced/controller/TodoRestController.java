package com.huli.backendadvanced.controller;

import com.huli.backendadvanced.model.Todo;
import com.huli.backendadvanced.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoRestController {

  TodoServiceImpl service;

  @Autowired
  public TodoRestController(TodoServiceImpl service) {
    this.service = service;
  }

  @GetMapping("/")
  public List<Todo> listAllTodos() {
    return service.getAllTodos();
  }

  @PostMapping("/add")
  public void addNewTodo(@RequestBody Todo todo) {
    service.addTodo(todo);
  }


}
