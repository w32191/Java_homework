package com.samwang.hw2;

public class Expression {

  public static void main(String[] args) {
    int sum = 0;
    for (int i = 1, j = 2; i <= 49; i += 2, j += 2) {
      sum += i * i - j * j;
    }
    System.out.println(sum);
  }
}
