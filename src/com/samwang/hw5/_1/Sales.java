package com.samwang.hw5._1;

public class Sales extends FullTimeEmployee {

  private int saleBonus;

  public Sales(String name, String male, String inaugurationDay, String phone, String email,
      int salary, int saleBonus, String position) {
    super(name, male, inaugurationDay, phone, email, salary, position);
    this.saleBonus = saleBonus;
  }

  @Override
  public int countOfBasicSalary() {
    return super.countOfBasicSalary() + saleBonus;
  }

}
