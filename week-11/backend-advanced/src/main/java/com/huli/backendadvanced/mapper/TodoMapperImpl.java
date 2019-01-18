package com.huli.backendadvanced.mapper;

import com.huli.backendadvanced.model.Todo;
import com.huli.backendadvanced.model.TodoDTO;
import com.huli.backendadvanced.model.TodoDetailsResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class TodoMapperImpl implements TodoMapper{

  public Todo DTOToEntity(TodoDTO todoDTO) {
    Todo todo = new Todo();
    todo.setTitle(todoDTO.getTitle());
    todo.setDone(todoDTO.getDone());
    todo.setUrgent(todoDTO.getUrgent());
    return todo;
  }

  public TodoDetailsResponseDTO entityToDetailsResponseDTO(Todo todo) {
    TodoDetailsResponseDTO todoDetailsResponseDTO = new TodoDetailsResponseDTO();
    todoDetailsResponseDTO.setId(todo.getId());
    todoDetailsResponseDTO.setTitle(todo.getTitle());
    todoDetailsResponseDTO.setDone(todo.getDone());
    todoDetailsResponseDTO.setUrgent(todo.getUrgent());
    return todoDetailsResponseDTO;
  }
}
