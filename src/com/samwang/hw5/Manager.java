package com.samwang.hw5;

public class Manager extends FullTimeEmployee {

  //績效獎金
  private int performanceBonus;
  //交通津貼
  private final int transportationAllowance = 3000;

  public Manager(String name, String male, String inaugurationDay, String phone,
      String email, int salary, int performanceBonus) {
    super(name, male, inaugurationDay, phone, email, salary);
    this.performanceBonus = performanceBonus;
  }

  @Override
  public int countOfBasicSalary() {
    return super.countOfBasicSalary() + transportationAllowance + performanceBonus;
  }

  @Override
  public void print() {
    super.print();
    System.out.println("職稱：主管");
  }
}
