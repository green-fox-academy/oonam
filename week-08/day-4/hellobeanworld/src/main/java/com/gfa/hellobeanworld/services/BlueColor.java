package com.gfa.hellobeanworld.services;

import com.gfa.hellobeanworld.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColor implements MyColor {

  @Autowired
  Printer myPrinter;

  @Override
  public void printColor() {
    myPrinter.log("It is blue in color...");
  }
}
