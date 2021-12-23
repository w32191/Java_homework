package com.samwang.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Prime {

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
        }
      }
      if (isPrime) {
        System.out.println(i);
      }
    }
  }
}
