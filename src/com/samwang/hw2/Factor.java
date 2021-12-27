package com.samwang.hw2;

import java.util.Scanner;

public class Factor {
  //輸入一正整數，求其所有的因數。
  //說明：36的因數為1, 2, 3, 4, 6, 9, 12, 18, 36。

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入數字：");
    int input = scanner.nextInt();
    int[] factors = new int[100];
    int index = 0;
    for (int i = 1; i <= input; i++) {
      if (input % i == 0) {
        factors[index] = i;
        index++;
      }
    } //end of for()

    System.out.print(input + "的因數:");
    for (int i = 0; i < factors.length; i++) {
      if (factors[i] == 0) {
        break;
      }
      System.out.print(factors[i]);
      if(factors[i]!=input){
        System.out.print(",");
      }
    } //end of for()

    scanner.close();

  }
}
