package com.samwang.hw5._1;

public class TestEmployee {

  public static void main(String[] args) {

    //測試一般員工
    Employee generalEmployee = new GeneralEmployee("王阿明", "男", "2022-01-01",
        "0900123456", "abc@gmail.com", 30000);
    //測試主管
    Employee manager = new Manager("陳阿水", "男", "2022-01-01",
        "0900654321", "def@gmail.com", 50000, 3700);
    //測試銷售員
    Employee sales = new Sales("蔡阿明", "男", "2022-01-01",
        "0900111222", "qaz@gmail.com", 40000, 6777);
    //測試臨時工
    Employee partTime = new PartTimeEmployee("張大大", "男", "2022-01-01",
        "0900111333", "ijj@gmail.com", 160, 150);

    generalEmployee.print();
    System.out.println("=============================");
    manager.print();
    System.out.println("=============================");
    sales.print();
    System.out.println("=============================");
    partTime.print();


  }
}
