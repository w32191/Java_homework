package com.samwang.hw2;

public class Rope {

  public static void main(String[] args) {
    //若有一條繩子長3000公尺，每天剪去一半的長度，需多少天繩子的長度會短於5公尺。

    int rope = 3000;
    int day = 0;

    while (rope > 5) {
      rope /= 2;
      day++;
    }
    System.out.println(day + "days");
  }
}
