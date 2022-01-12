package com.samwang.hw1;

import java.util.Scanner;

public class Electricity {

  //非營業用電等級
  private static final int firstStepOfNonCommercial = 120;
  private static final int secondStepOfNonCommercial = 330;
  private static final int thirdStepOfNonCommercial = 500;
  private static final int fourStepOfNonCommercial = 700;
  private static final int fiveStepOfNonCommercial = 1000;

  //非營業用電費率
  private static final double firstPriceOfNonCommercial = 1.63;
  private static final double secondPriceOfNonCommercial = 2.1;
  private static final double thirdPriceOfNonCommercial = 2.89;
  private static final double fourPriceOfNonCommercial = 3.94;
  private static final double fivePriceOfNonCommercial = 4.6;


  public static double electricityPrice(String isCommercial, int electricity) {

    double totalPrice;
    if (isCommercial.equals("A")) {
      if (electricity <= firstStepOfNonCommercial) {
        totalPrice = electricity * firstPriceOfNonCommercial;

      } else if (electricity <= secondStepOfNonCommercial) {
        totalPrice = firstStepOfNonCommercial * firstPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial) * secondPriceOfNonCommercial;

      } else if (electricity <= thirdStepOfNonCommercial) {
        totalPrice = firstStepOfNonCommercial * firstPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial) * secondPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial - secondStepOfNonCommercial)
            * thirdPriceOfNonCommercial;
/////////
      } else if (electricity <= fourStepOfNonCommercial) {
        totalPrice = firstStepOfNonCommercial * firstPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial) * secondPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial - thirdStepOfNonCommercial)
            * thirdPriceOfNonCommercial +
            (electricity - firstStepOfNonCommercial - thirdStepOfNonCommercial
                - fourStepOfNonCommercial) * fourPriceOfNonCommercial;

      } else if (electricity <= fiveStepOfNonCommercial) {
        totalPrice = firstStepOfNonCommercial * firstPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial) * secondPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial - thirdStepOfNonCommercial)
            * thirdPriceOfNonCommercial +
            (electricity - firstStepOfNonCommercial - thirdStepOfNonCommercial
                - fourStepOfNonCommercial) * fourPriceOfNonCommercial
            + (electricity - firstStepOfNonCommercial - thirdStepOfNonCommercial
            - fourStepOfNonCommercial) * fivePriceOfNonCommercial;

      } else { // 1001以上
        totalPrice = 120 * 1.63 + 210 * 2.1 + 170 * 2.89 + 200 * 3.94 + 300 * 4.6
            + (electricity - 1000) * 5.03;
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

    scanner.close();

  }

}
