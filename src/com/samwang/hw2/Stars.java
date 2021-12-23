package com.samwang.hw2;

public class Stars {

  public static void main(String[] args) {
    //first
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
        System.out.print(" ");
      }
      System.out.print("\n");
    }
    System.out.println("------------------");
    //second
    for (int i = 1; i <= 5; i++) {
      for (int k = 0; k < i - 1; k++) {
        System.out.print("__");
      }
      for (int j = 1; j <= 5 - (i - 1); j++) {
        System.out.print("_*");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println("------------------");

    //third
    for (int i = 1; i <= 5; i++) {

      //每行空格的個數
      for (int k = 1; k <= 5 - i; k++) {  //空格數=行數-行號
        System.out.print(" ");
      }

      //每行*的個數
      for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}