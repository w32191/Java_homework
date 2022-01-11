package com.samwang.hw5;

public abstract class FullTimeEmployee extends Employee {

  //本薪
  private int salary;
  //午餐津貼
  private static final int lunchAllowance = 2400;

  //總月薪
  private int salaryOfMonth;

  public FullTimeEmployee(String name, String male, String inaugurationDay, String phone,
      String email, int salary) {
    super(name, male, inaugurationDay, phone, email);
    this.salary = salary;
  }

  //計算本薪加上午餐
  @Override
  public int countOfBasicSalary() {
    salaryOfMonth = salary + lunchAllowance;
    return salaryOfMonth;
  }

}
