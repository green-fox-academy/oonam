package com.gfa.todosql.Controller;

import com.gfa.todosql.Model.Todo;
import com.gfa.todosql.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoService service;

  @Autowired
  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", service.getTodoList());
    return "todolist";
  }

  @GetMapping("/add")
  public String addForm(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "addPage";
  }

  @PostMapping("/addTodo")
  public String addTodo (@ModelAttribute Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/list";
  }
}
