package com.driver;

public class Main {
  // creating a template of car
  class car(){
    public void run(){
      System.out.print("Car is running");
    }
  }
  // creating a company tag which is extending the car class
  class tata extends car{
    // overriding run method 
    pubic void run(){
      System.out.print("Tata car is running");
    }
  }
}
