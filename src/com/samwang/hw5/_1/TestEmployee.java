package com.samwang.hw5._1;

import java.util.List;
import java.util.concurrent.ExecutorService;

public class TestEmployee {

  public static void main(String[] args) throws Exception {


    EmployeeFile employeeFile = new EmployeeFile();
    employeeFile.readFile();

    List<String> list;

    for (int i = 0; i < employeeFile.getReadList().size(); i++) {
      Employee employee;
      list = employeeFile.insEmployee(employeeFile.tokens(i));
      if (list.get(0).equals("一般員工")) {
        employee = new GeneralEmployee(list.get(1), list.get(2), list.get(3), list.get(4),
            list.get(5),
            Integer.parseInt(list.get(6)),list.get(0));
        employee.print();
      } else if (list.get(0).equals("主管")) {
        employee = new Manager(list.get(1), list.get(2), list.get(3), list.get(4), list.get(5),
            Integer.parseInt(list.get(6)), Integer.parseInt(list.get(7)),list.get(0));
        employee.print();
      } else if (list.get(0).equals("銷售員")) {
        employee = new Sales(list.get(1), list.get(2), list.get(3), list.get(4), list.get(5),
            Integer.parseInt(list.get(6)), Integer.parseInt(list.get(7)),list.get(0));
        employee.print();
      } else if (list.get(0).equals("臨時工")) {
        employee = new PartTimeEmployee(list.get(1), list.get(2), list.get(3), list.get(4),
            list.get(5),
            Integer.parseInt(list.get(6)), Integer.parseInt(list.get(7)),list.get(0));
        employee.print();
      }
      System.out.println("==================");
    }//end of for()

  }
}
