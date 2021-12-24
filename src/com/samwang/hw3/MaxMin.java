package com.samwang.hw3;

import java.util.Arrays;
import java.util.Random;

public class MaxMin {

  public static void main(String[] args) {
    //事先將10個數字置於一維陣列中，分別找出10個數字中最大的值和最小的值。
    int[] array = {53, 12, 8, 40, 75, 14, 54, 46, 42, 45};
    System.out.println(Arrays.toString(array));
//    Random rand = new Random();

//    for (int i = 0; i < array.length; i++) {
//      array[i] = rand.nextInt(100);
//    }
//    for (int i : array
//    ) {
//      System.out.print(i + " ");
//    }
//    System.out.println();

    int max = array[0];
    for (int i = 1; i < array.length; i++) {
      if (max > array[i]) {
        continue;
      } else {
        max = array[i];
      }
    }

    System.out.println(max);

  }
}
