package com.samwang.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Prime {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input a number:");
    int inputNumber = scanner.nextInt();

    int[] prime = new int[1000];
    int count = 0;

    for (int i = 1; i < inputNumber; i++) {

      if (i == 2) {
        prime[count] = inputNumber;
        count++;
      } else if (inputNumber > 2) {

        for (int j = 3; j <= inputNumber; j += 2) {
          if (inputNumber % j != 0) {
            prime[count] = j;
            count++;
          }
        } //end of inner for()
      } //end of if()
    } //end of outer for()

    System.out.println(Arrays.toString(prime));
  }
}
