package com.samwang.hw2;

public class Interest {

  public static void main(String[] args) {
//test
    int n = 1, P = 100000;
    double A, B;

    while (true) {
      //A
      A = P * (1 + 0.1 * n);

      //B
      double rate = 1.0;
      for (int i = 1; i <= n; i++) {
        rate *= 1.05;
      }
      B = P * rate;

      if (B > A) {
        System.out.println(n + "年");
        break;
      } else {
        n++;
      }
    } //end of while()


  }
}
