package com.samwang.hw2;

public class Amstrong {

  public static void main(String[] args) {

    int[] Amstrong = new int[1000];
    int count = 0;

    for (int i = 100; i <= 999; i++) {    //所有三位數
      int a, b, c;
      a = i / 100;
      b = i % 100 / 10;
      c = i % 10;
      //System.out.println(a + "+" + b + "+" + c);

      if (i == a * a * a + b * b * b + c * c * c) {
        Amstrong[count] = i;
        count++;
      }
    } //end of for()
    System.out.print("三位數中所有Amstrong數：");
    for (int i : Amstrong) {
      if (i != 0) {
        System.out.print(i + ",");
      }
    }

  }

}
