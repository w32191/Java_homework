package com.samwang.hw5;

public class GeneralEmployee extends FullTimeEmployee {


  public GeneralEmployee(String name, String male, String inaugurationDay, String phone,
      String email, int salary) {
    super(name, male, inaugurationDay, phone, email, salary);
  }

  @Override
  public void print() {
    super.print();
    System.out.println("職稱：一般員工");
  }
}
