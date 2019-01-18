package com.gfa.todo3.Controller;

import com.gfa.todo3.Model.Todo;
import com.gfa.todo3.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if (isActive) {
      model.addAttribute("todos", service.getActiveOnly());
    } else {
      model.addAttribute("todos", service.getTodoList());
    }
    return "todolist";
  }

  @GetMapping("/new")
  public String addform(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/new")
  public String addNewTodo(@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    service.deleteTodoById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String editForm(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.getTodoById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String postEdit(@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/";
  }
}
