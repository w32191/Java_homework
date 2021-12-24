package com.samwang.hw3;

public class Sales {

  public static void main(String[] args) {
    int[][] array = {
        {33, 32, 56, 45, 33},  //Jean
        {77, 33, 68, 45, 23},  //Tom
        {43, 55, 43, 67, 65}   //Tina
    };
    int[] price = {12, 16, 10, 14, 15}; // 單價分別為12、16、10、14、15元
    int[] performance = new int[3];   //存放每個人的銷售總額(業績)
    /*
    a. 每一個銷售員的銷售總金額
    b. 有最好業績（銷售總金額最多者）的銷售員
    c. 每一項產品的銷售總金額
    d. 銷售總金額最多的產品
    */

    //a. 每一個銷售員的銷售總金額
    System.out.println("A:");
    for (int i = 0; i < array.length; i++) {  //控制成員
      int sum = 0;
      for (int j = 0; j < array[i].length; j++) {

        sum += array[i][j] * price[j];

//        sum += array[i][0] * price[0]
//            + array[i][1] * price[1]
//            + array[i][2] * price[2]
//            + array[i][3] * price[3]
//            + array[i][4] * price[4];

      }
      if (i == 0) {
        System.out.println("Jean 銷售總金額:$" + sum);
        performance[0] = sum;
      } else if (i == 1) {
        System.out.println("Tom 銷售總金額:$" + sum);
        performance[1] = sum;
      } else {
        System.out.println("Tina 銷售總金額:$" + sum);
        performance[2] = sum;
      }
    }

    System.out.println("----------------------");
    System.out.println("B:");

    int maxPerformanceIndex = 0;
    for (int i = 1; i < performance.length; i++) {
      if (performance[maxPerformanceIndex] < performance[i]) {
        maxPerformanceIndex = i;
      }
    }
    switch (maxPerformanceIndex) {
      case 0:
        System.out.print("Jean");
        break;
      case 1:
        System.out.print("Tom");
        break;
      case 2:
        System.out.print("Tina");
        break;
      default:
        System.out.println("ERROR!");
    }
    System.out.println("的業績最高");

    System.out.println("----------------------");
    System.out.println("C:");



  }
}
