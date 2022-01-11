package com.samwang.hw3;

public class Sales {

  /*
  a. 每一個銷售員的銷售總金額
  b. 有最好業績（銷售總金額最多者）的銷售員
  c. 每一項產品的銷售總金額
  d. 銷售總金額最多的產品
  */
  public static void main(String[] args) {
    int[][] array = {
        {33, 32, 56, 45, 33},  //Jean
        {77, 33, 68, 45, 23},  //Tom
        {43, 55, 43, 67, 65}   //Tina
    };

    int[] price = {12, 16, 10, 14, 15}; // 單價分別為12、16、10、14、15元
    int[] performance = new int[3];   //存放每個人的銷售總額(業績)
    int[] product = new int[5];   //存放每個產品銷售總額

    //a. 每一個銷售員的銷售總金額
    System.out.println("A:");
    for (int i = 0; i < array.length; i++) {  //控制成員
      int sum = 0;
      for (int j = 0; j < array[i].length; j++) {

        sum += array[i][j] * price[j];  //加總銷售總額(人)

        product[j] += array[i][j] * price[j];   //加總每個產品銷售額

      }   //end of for(j)
      if (i == 0) {
        System.out.println("Jean 銷售總金額:$" + sum);
        performance[0] = sum;
      } else if (i == 1) {
        System.out.println("Tom 銷售總金額:$" + sum);
        performance[1] = sum;
      } else {
        System.out.println("Tina 銷售總金額:$" + sum);
        performance[2] = sum;
      }   //end of if(performance)
    }   //end of for(i)

    //b. 有最好業績（銷售總金額最多者）的銷售員
    System.out.println("----------------------");
    System.out.println("B:");

    int maxPerformanceIndex = 0;
    for (int i = 1; i < performance.length; i++) {
      if (performance[maxPerformanceIndex] < performance[i]) {
        maxPerformanceIndex = i;
      }
    }   //end of for(銷售總金額最多者)

    //找performance[] maxIndex
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
    }   //end of switch(maxPerformanceIndex)
    System.out.println("的業績最高");

    //  c. 每一項產品的銷售總金額
    System.out.println("----------------------");
    System.out.println("C:");

    for (int i = 0; i < product.length; i++) {
      switch (i) {
        case 0:
          System.out.println("product A:$" + product[i]);
          break;
        case 1:
          System.out.println("product B:$" + product[i]);
          break;
        case 2:
          System.out.println("product C:$" + product[i]);
          break;
        case 3:
          System.out.println("product D:$" + product[i]);
          break;
        case 4:
          System.out.println("product E:$" + product[i]);
          break;
        default:
          System.out.println("Error!");
      }
    }

    System.out.println("------------------------------");
    System.out.println("D:");

    int maxProductIndex = 0;
    for (int i = 1; i < product.length; i++) {
      if (product[maxProductIndex] < product[i]) {
        maxProductIndex = i;
      }
    }

    //找product[] maxIndex
    switch (maxProductIndex) {
      case 0:
        System.out.print("product A");
        break;
      case 1:
        System.out.print("product B");
        break;
      case 2:
        System.out.print("product C");
        break;
      case 3:
        System.out.print("product D");
        break;
      case 4:
        System.out.print("product E");
        break;
      default:
        System.out.println("ERROR!");
    }
    System.out.println(" 的業績最高");


  }
}
