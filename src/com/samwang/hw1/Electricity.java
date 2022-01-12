package com.samwang.hw1;

import java.util.Scanner;

public class Electricity {

  //非營業用電等級
  private static final int stepOfNonBusiness[] = {120, 330, 500, 700, 1000};
  //非營業用電費率
  private static final double priceOfNonBusiness[] = {1.63, 2.1, 2.89, 3.94, 4.6};


  public static double electricityPrice(String isCommercial, int electricity) {

    double totalPrice = 0;
    if (isCommercial.equals("A")) {

      if (electricity <= stepOfNonBusiness[0]) {
        totalPrice = electricity * priceOfNonBusiness[0];

      } else if (electricity <= stepOfNonBusiness[1]) {
        totalPrice = electricity * priceOfNonBusiness[0]
            + (electricity - stepOfNonBusiness[0]) * priceOfNonBusiness[1];

      } else if (electricity <= stepOfNonBusiness[2]) {
        totalPrice = electricity * priceOfNonBusiness[0]
            + (electricity - stepOfNonBusiness[0]) * priceOfNonBusiness[1]
            + (electricity - stepOfNonBusiness[0] - stepOfNonBusiness[1])
            * priceOfNonBusiness[2];

      } else if (electricity <= stepOfNonBusiness[3]) {
        totalPrice = electricity * priceOfNonBusiness[0]
            + (electricity - stepOfNonBusiness[0]) * priceOfNonBusiness[1]
            + (electricity - stepOfNonBusiness[0] - stepOfNonBusiness[1])
            * priceOfNonBusiness[2]
            + (electricity - stepOfNonBusiness[0] - stepOfNonBusiness[1] - stepOfNonBusiness[2])
            * priceOfNonBusiness[3];

      } else if (electricity <= stepOfNonBusiness[4]) {
        totalPrice = electricity * priceOfNonBusiness[0]
            + (electricity - stepOfNonBusiness[0]) * priceOfNonBusiness[1]
            + (electricity - stepOfNonBusiness[0] - stepOfNonBusiness[1])
            * priceOfNonBusiness[2]
            + (electricity - stepOfNonBusiness[0] - stepOfNonBusiness[1] - stepOfNonBusiness[2])
            * priceOfNonBusiness[3]
            + (electricity - stepOfNonBusiness[0] - stepOfNonBusiness[1] - stepOfNonBusiness[2]
            - stepOfNonBusiness[3]) * priceOfNonBusiness[4];
      }
      return totalPrice;

    } else if (isCommercial.equals("B")) {

      if (electricity <= 330) {
        totalPrice = electricity * 2.12;
      } else if (electricity <= 700) {
        totalPrice = 330 * 2.12 + (electricity - 330) * 2.91;
      } else if (electricity <= 1500) {
        totalPrice = 330 * 2.12 + 370 * 2.91 + (electricity - 700) * 3.44;
      } else { // 1500以上
        totalPrice = 330 * 2.12 + 370 * 2.91 + 800 * 3.44 + (electricity - 1500) * 5.05;
      }
      return totalPrice;

    } else {
      return 0;
    }


  }

  public static void main(String[] args) {
    System.out.println("非營業用請輸入(A),營業用請輸入(B)：");
    Scanner scanner = new Scanner(System.in);
    String isCommercial = scanner.nextLine();

    System.out.println("請輸入使用度數:");
    int electricity = scanner.nextInt(); // 度數
    System.out.println(electricityPrice(isCommercial, electricity));

    scanner.close();

  }

}
