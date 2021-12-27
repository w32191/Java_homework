package com.samwang.hw2;

public class Interest {

  public static void main(String[] args) {

//    int n = 1;
//    double A, B;
//    while (true) {
//      A = 100000 * (1 + 0.1 * n);
//      B = 100000 * Math.pow((1 + 0.05), n);
//      if (B > A) {
//        System.out.println(n + "年");
//        break;
//      } else {
//        n++;
//      }
//    }
    int n = 1, P = 100000;
    double A, B;

    while (true) {
      double rate = 1.0;

      A = P * (1 + 0.1 * n);

      for (int i = 1; i <= n; i++) {
        rate = rate * 1.05;
      }
      B = P * rate;

      if (B > A) {
        System.out.println(n + "年");
        break;
      } else {
        n++;
      }
    }
  }
}
