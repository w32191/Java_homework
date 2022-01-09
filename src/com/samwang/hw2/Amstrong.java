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

      if (i == a * a * a + b * b * b + c * c * c) {
        Amstrong[count] = i;
        count++;
      }
    } //end of for()

    System.out.println("三位數中所有Amstrong數：");

    for (int i = 0; i < Amstrong.length; i++) {
      //因 Amstrong[] 後面都會是0，所以當取出到0的時候就結束
      if(Amstrong[i] == 0){
        break;
      }
      System.out.println(Amstrong[i]);
    }

  }

}
