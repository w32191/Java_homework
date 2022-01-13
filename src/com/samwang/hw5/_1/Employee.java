package com.samwang.hw5._1;

public abstract class Employee {

  private String name, male, inaugurationDay, phone, email, position;

  public Employee(String name, String male, String inaugurationDay, String phone, String email,
      String position) {
    this.name = name;
    this.inaugurationDay = inaugurationDay;
    this.phone = phone;
    this.email = email;
    this.male = male;
    this.position = position;
  }

  public abstract int countOfBasicSalary();

  public void print() {
    System.out.println("姓名：" + name);
    System.out.println("性別：" + male);
    System.out.println("到職日：" + inaugurationDay);
    System.out.println("電話：" + phone);
    System.out.println("信箱：" + email);
    System.out.println("職位：" + position);
    System.out.println("當月薪水：" + countOfBasicSalary());
  }

}
