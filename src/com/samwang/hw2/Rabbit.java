package com.samwang.hw2;

public class Rabbit {

  public static void main(String[] args) {
    //老王養了一群兔子，若三隻三隻一數，剩餘一隻；若五隻五隻一數，剩餘三隻；若七隻七隻一數，剩餘二隻。試問兔子最少有幾隻。
    int rabbits = 0;
    boolean isAnswer = true;
    while (isAnswer) {
      if (rabbits % 3 == 1 && rabbits % 5 == 3 && rabbits % 7 == 1) {
        System.out.println(rabbits+"隻兔子");
        break;
      }
      rabbits++;
    }
  }
}
