package com.samwang.hw1;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入年份：");
    int year = scanner.nextInt();

    if (year % 400 == 0) {
      System.out.println("西元" + year + "年 是閏年");
    } else if (year % 100 == 0) {
      System.out.println("西元" + year + "年 不是閏年");
    } else if (year % 4 == 0) {
      System.out.println("西元" + year + "年 是閏年");
    } else {
      System.out.println("西元" + year + "年 不是閏年");
    }

    scanner.close();
  }

}
