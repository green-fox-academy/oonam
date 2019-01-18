package com.w10d1.rest.Model;

public class Doubling {

  private Integer received;
  private Integer result;

  public Doubling() {
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public void doDoubling() {
    result = received * 2;
  }
}
