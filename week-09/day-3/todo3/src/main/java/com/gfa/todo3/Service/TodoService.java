package com.gfa.todo3.Service;

import com.gfa.todo3.Model.Todo;
import com.gfa.todo3.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {

  TodoRepository repository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public void addTodo(Todo todo) {
    if (todo != null) {
      repository.save(todo);
    }
  }

  public List<Todo> getTodoList() {
    List<Todo> todoList = new ArrayList<>();
    repository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  public List<Todo> getActiveOnly() {
    List<Todo> activeOnly = getTodoList()
      .stream()
      .filter(todo -> !todo.getIsDone())
      .collect(Collectors.toList());
    return activeOnly;
  }

  public void deleteTodoById(long id) {
    repository.deleteById(id);
  }

  public Todo getTodoById(long id) {
    return repository.findById(id).orElse(null);
  }
}
