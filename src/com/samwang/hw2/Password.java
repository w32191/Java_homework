package com.samwang.hw2;

import java.util.Scanner;

public class Password {

  public static void main(String[] args) {
    //出現”請輸入密碼”的提示，使用者有最多三次輸入的機會。
    //若輸入正確，則印出”密碼輸入正確，歡迎使用本系統！”。
    //若輸入不正確，再次出現”請輸入密碼”的提示。
    //若三次輸入不正確，則印出”密碼輸入超過三次！”，並結束程式的執行。

    Scanner scanner = new Scanner(System.in);
    String inputPassword;
    String correctPassword = "1234";

    int count = 0;

    do {
      System.out.println("請輸入密碼:");
      inputPassword = scanner.nextLine();

      if (inputPassword.equals(correctPassword)) {
        System.out.println("密碼輸入正確，歡迎使用本系統！");
        break;

      } else {
        count++;
      }

      if (count >= 3) {
        System.out.println("密碼輸入超過三次！");
        break;
      }
    } while (true);


  }
}
