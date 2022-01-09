package com.samwang.hw3;

public class MaxMin {

  public static void main(String[] args) {
    //事先將10個數字置於一維陣列中，分別找出10個數字中最大的值和最小的值。
    int[] array = {53, 12, 8, 40, 75, 14, 54, 46, 42, 45};

    int max = array[0]; //先假設第一個最大，依序比較
    int min = array[0]; //先假設第一個最小，依序比較

    for (int i = 1; i < array.length; i++) {  // 從index=1開始比較

      if (max < array[i]) {
        max = array[i];
      }
      if (min > array[i]) {
        min = array[i];
      }
    }

    System.out.println("Max:" + max);
    System.out.println("Min:" + min);

  }
}
