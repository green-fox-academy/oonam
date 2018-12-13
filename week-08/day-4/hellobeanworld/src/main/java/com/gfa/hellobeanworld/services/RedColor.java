package com.gfa.hellobeanworld.services;

import com.gfa.hellobeanworld.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  @Autowired
  Printer myPrinter;

  @Override
  public void printColor() {
    myPrinter.log("It is red in color...");
  }
}
