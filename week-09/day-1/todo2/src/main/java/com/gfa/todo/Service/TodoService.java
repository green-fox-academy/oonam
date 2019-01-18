package com.gfa.todo.Service;

import com.gfa.todo.Model.Todo;
import com.gfa.todo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

  private TodoRepository repository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public List<Todo> getAllTodos() {
    List<Todo> listOfTodos = new ArrayList<>();
    repository.findAll().forEach(todo -> listOfTodos.add(todo));
    return listOfTodos;
  }


}
