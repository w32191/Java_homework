package com.samwang.hw1;

import java.util.Scanner;

public class Electricity {

  public static void main(String[] args) {
    //test git
    System.out.println("非營業用請輸入(A),營業用請輸入(B)：");
    Scanner scanner = new Scanner(System.in);
    String isCommercial = scanner.nextLine();

    System.out.println("請輸入使用度數:");
    int electricity = scanner.nextInt(); // 度數
    double price; // 電費

    switch (isCommercial) {
      case "A": // 非營業用
        if (electricity <= 120) {
          price = electricity * 1.63;
        } else if (electricity <= 330) {
          price = 120 * 1.63 + (electricity - 120) * 2.1;
        } else if (electricity <= 500) {
          price = 120 * 1.63 + 210 * 2.1 + (electricity - 330) * 2.89;
        } else if (electricity <= 700) {
          price = 120 * 1.63 + 210 * 2.1 + 170 * 2.89 + (electricity - 500) * 3.94;
        } else if (electricity <= 1000) {
          price = 120 * 1.63 + 210 * 2.1 + 170 * 2.89 + 200 * 3.94 + (electricity - 700) * 4.6;
        } else { // 1001以上
          price = 120 * 1.63 + 210 * 2.1 + 170 * 2.89 + 200 * 3.94 + 300 * 4.6
              + (electricity - 1000) * 5.03;
        }
        System.out.println("非營業用電，電費為:" + price);

        break;

      case "B": // 營業用
        if (electricity <= 330) {
          price = electricity * 2.12;
        } else if (electricity <= 700) {
          price = 330 * 2.12 + (electricity - 330) * 2.91;
        } else if (electricity <= 1500) {
          price = 330 * 2.12 + 370 * 2.91 + (electricity - 700) * 3.44;
        } else { // 1500以上
          price = 330 * 2.12 + 370 * 2.91 + 800 * 3.44 + (electricity - 1500) * 5.05;
        }

        System.out.println("營業用電，電費為:" + price);
        break;

      default:
        System.out.println("input error!");
    }
    scanner.close();

  }

}
