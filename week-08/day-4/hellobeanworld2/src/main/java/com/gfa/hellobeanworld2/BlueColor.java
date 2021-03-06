package com.gfa.hellobeanworld2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BlueColor implements MyColor {

  @Autowired
  Printer myPrinter;

  @Override
  public void printColor() {
    myPrinter.log("It is blue in color...");
  }
}
