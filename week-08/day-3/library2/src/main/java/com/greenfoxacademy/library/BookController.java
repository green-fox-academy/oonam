package com.greenfoxacademy.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

  private List<Book> books = new ArrayList<>();

  public BookController() {
    books.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
    books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
  }

  @RequestMapping(path = "/books", method = RequestMethod.GET)
  public String showBooks(Model model) {
    model.addAttribute("books", books);
    return "index";
  }

  @RequestMapping(path = "/books/{id}/details", method = RequestMethod.GET)
  public String getBookById(Model model, @PathVariable(name="id") Integer id) {
    Book bookById = null;

    for(Book book : books) {
      if (book.getId() == id) {
        bookById = book;
      }
    }

    if (bookById != null) {
      model.addAttribute("book", bookById);
    } else {
      model.addAttribute("error", "No book found");
    }

    return "details";
  }
}
