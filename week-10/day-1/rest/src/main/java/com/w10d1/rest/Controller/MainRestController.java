package com.w10d1.rest.Controller;

import com.w10d1.rest.Model.DoUntil;
import com.w10d1.rest.Model.Doubling;
import com.w10d1.rest.Model.Until;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MainRestController {

  @GetMapping(value = "/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      Doubling doubling = new Doubling();
      doubling.setReceived(input);
      doubling.doDoubling();
      return doubling;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide an input!");
      return error;
    }
  }

  @GetMapping(value = "/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a name and a title!");
      return error;
    } else if (name == null && title != null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a name!");
      return error;
    } else if (name != null && title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a title!");
      return error;
    } else {
      HashMap<String, String> greeter = new HashMap<>();
//      greeter.put("welcome_message", "Oh, hi there " + name + ", my dear " + title + "!");
      greeter.put("welcome_message", String.format("Oh, hi there %s, my dear %s!", name, title));
      return greeter;
    }
  }

  @GetMapping(value = "/appenda")
  public Object pageNotFound() {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @GetMapping(value = "/appenda/{appendable}")
  public Object appenda(@PathVariable("appendable") String appendable) {
    HashMap<String, String> appendWithA = new HashMap<>();
    appendWithA.put("appended", appendable + "a");
    return appendWithA;
  }

  @PostMapping(value = "/dountil/{action}")
  public Object doUntil(@PathVariable("action") String action, @RequestBody Until until) {
    if (action.equals("sum")) {
      DoUntil sumUntil = new DoUntil();
      sumUntil.sum(until);
      return sumUntil;
    } else if (action.equals("factor")) {
      DoUntil factUntil = new DoUntil();
      factUntil.factorial(until);
      return factUntil;
    } else {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a number!");
      return error;
    }
  }
}
