package com.huli.backendadvanced.service;

import com.huli.backendadvanced.model.Todo;

import java.util.List;

public interface TodoService {

  List<Todo> getActiveTodos();
  List<Todo> getAllTodos();
  void addTodo(Todo todo);
  void deleteTodoById (long id);
  Todo getTodoById(long id);
}
