package com.samwang.hw2;

import java.util.Scanner;

public class Prime {

  //輸入一正整數，找出所有小於或等於的質數。
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input a number:");
    int inputNumber = scanner.nextInt();

    for (int i = 2; i < inputNumber; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        } //end of inner if()
      } //end of inner for()
      if (isPrime) {
        System.out.println(i);
      }   //end of outer if()
    }   //end of outer for()


  }
}
