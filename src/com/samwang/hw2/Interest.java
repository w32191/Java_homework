package com.samwang.hw2;

public class Interest {

  public static void main(String[] args) {
    boolean isOverMoney = true;
    int n = 1;
    double A, B;
    while (true) {
      A = 100000 * (1 + 0.1 * n);
      B = 100000 * Math.pow((1 + 0.05), n);
      if (B > A) {
        System.out.println(n + "年");
        break;
      } else {
        n++;
      }
    }

  }
}
