package com.samwang.hw2;

import java.util.Arrays;

public class PerfectNumber {

  public static void main(String[] args) {
    int[] perfectNumber = new int[100];
    int count = 0;

    for (int i = 1; i <= 100; i++) {//找出1~100
      int sum = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          sum += j;
        }
      }
      if (i == sum) {
        perfectNumber[count] = i;
        count++;
      }
    } //end of outer for()

    System.out.print("100內的完美數字：");
    for (int i : perfectNumber) {
      if (i != 0) {
        System.out.print(i + ",");
      }
    }


  }
}
