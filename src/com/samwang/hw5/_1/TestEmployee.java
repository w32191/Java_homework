package com.samwang.hw5._1;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class TestEmployee {

  public static void main(String[] args) throws Exception {

    //測試一般員工
//    Employee generalEmployee = new GeneralEmployee("王阿明", "男", "2022-01-01",
//        "0900123456", "abc@gmail.com", 30000);
    //測試主管
//    Employee manager = new Manager("陳阿水", "男", "2022-01-01",
//        "0900654321", "def@gmail.com", 50000, 3700);
    //測試銷售員
//    Employee sales = new Sales("蔡阿明", "男", "2022-01-01",
//        "0900111222", "qaz@gmail.com", 40000, 6777);
    //測試臨時工
//    Employee partTime = new PartTimeEmployee("張大大", "男", "2022-01-01",
//        "0900111333", "ijj@gmail.com", 160, 150);

//    generalEmployee.print();
//    System.out.println("=============================");
//    manager.print();
//    System.out.println("=============================");
//    sales.print();
//    System.out.println("=============================");
//    partTime.print();

    EmployeeFile employeeFile = new EmployeeFile();
    employeeFile.readFile();

    List<String> list;

    for (int i = 0; i < employeeFile.getReadList().size(); i++) {
      Employee employee;
      list = employeeFile.insEmployee(employeeFile.tokens(i));
      if (list.get(0).equals("一般員工")) {
        employee = new GeneralEmployee(list.get(1), list.get(2), list.get(3), list.get(4),
            list.get(5),
            Integer.parseInt(list.get(6)));
        employee.print();
      } else if (list.get(0).equals("主管")) {
        employee = new Manager(list.get(1), list.get(2), list.get(3), list.get(4), list.get(5),
            Integer.parseInt(list.get(6)), Integer.parseInt(list.get(7)));
        employee.print();
      } else if (list.get(0).equals("銷售員")) {
        employee = new Sales(list.get(1), list.get(2), list.get(3), list.get(4), list.get(5),
            Integer.parseInt(list.get(6)), Integer.parseInt(list.get(7)));
        employee.print();
      } else if (list.get(0).equals("臨時工")) {
        employee = new PartTimeEmployee(list.get(1), list.get(2), list.get(3), list.get(4),
            list.get(5),
            Integer.parseInt(list.get(6)), Integer.parseInt(list.get(7)));
        employee.print();
      }
      System.out.println("==================");
    }//end of for()

  }
}
