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
    int rows = 5;
    // 控制行數
    for (int i = rows; i > 0; i--) {
      // 每行的空格數為 rows-i個
      for (int j = 0; j < rows - i; j++) {
        System.out.print(" ");
      }
      // 每行的符號個數為 i個或者 2*i-1個(i個為直角三角形,2*i-1個為等腰三角形)
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      // 列印完每行的空格和符號,進行換行
      System.out.println();
    }

  }
}
