package com.huli.backendadvanced.mapper;

import com.huli.backendadvanced.model.Todo;
import com.huli.backendadvanced.model.TodoDTO;
import com.huli.backendadvanced.model.TodoDetailsResponseDTO;

public interface TodoMapper {

  public Todo DTOToEntity(TodoDTO todoDTO);
  public TodoDetailsResponseDTO entityToDetailsResponseDTO(Todo todo);
}
