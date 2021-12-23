package com.samwang.hw2;

import java.util.Scanner;

public class Factor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("請輸入數字：");
    int input = scanner.nextInt();
    String result = "的因數為：";
    for (int i = 1; i <= input; i++) {
      if (input % i == 0) {
        result += i;
        if (input != i) {
          result += ",";
        }
      }
    } //end of for()
    System.out.println(input + result);

    scanner.close();

  }
}
