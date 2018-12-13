package com.gfa.hellobeanworld.services;

import com.gfa.hellobeanworld.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class GreenColor implements MyColor {

  @Autowired
  Printer myPrinter;

  @Override
  public void printColor() {
    myPrinter.log("It is green in color...");
  }
}
