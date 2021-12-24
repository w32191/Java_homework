package com.samwang.hw2;

public class Expression {

  //利用for迴圏計算1^2-2^2+3^2-4^2+…+49^2-50^2的值。
  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1, j = 2; i <= 49; i += 2, j += 2) {
      sum += i * i - j * j;
    }
    System.out.println(sum);
  }
}
