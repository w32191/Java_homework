package com.samwang.hw5._1;

public class PartTimeEmployee extends Employee {

  private int partTimeSalary, workDays; //時薪、工作時數

  public PartTimeEmployee(String name, String male, String inaugurationDay, String phone,
      String email, int partTimeSalary, int workDays, String position) {
    super(name, male, inaugurationDay, phone, email, position);
    this.partTimeSalary = partTimeSalary;
    this.workDays = workDays;
  }

  @Override
  public int countOfBasicSalary() {
    return partTimeSalary * workDays;
  }


}
