package com.huli.backendadvanced.service;

import com.huli.backendadvanced.model.Todo;
import com.huli.backendadvanced.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  TodoRepository repository;

  @Autowired
  public TodoServiceImpl(TodoRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Todo> getActiveTodos() {
    return repository.findAllByDoneIsFalse();
  }

  @Override
  public List<Todo> getAllTodos() {
    return (List<Todo>) repository.findAll();
  }

  @Override
  public void addTodo(Todo todo) {
    repository.save(todo);
  }

  @Override
  public void deleteTodoById(long id) {
    repository.deleteById(id);
  }

  @Override
  public Todo getTodoById(long id) {
    return repository.findById(id).orElse(null);
  }
}
