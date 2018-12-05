package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  static AtomicLong atomicLong = new AtomicLong(1);
  static long id;
  String content;

  public Greeting(String content) {
    this.id = atomicLong.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
