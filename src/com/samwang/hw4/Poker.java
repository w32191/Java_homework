package com.samwang.hw4;

import java.util.ArrayList;
import java.util.List;


public class Poker {

  List<Integer> list = new ArrayList<>();

  public void randomCard() {
    do {
      // 花色i/13，數字i%13+1
      int randomCard = (int) (Math.random() * 52);
      if (!list.contains(randomCard)) {
        list.add(randomCard);
      }
    } while (list.size() < 52);
    detail();
  }

  private void detail() {
    int count = 1;
    for (int i = 0; i < list.size(); i++) {
      String flower = "";
      if (list.get(i) / 13 == 0) {
        flower = "黑桃";
      } else if (list.get(i) / 13 == 1) {
        flower = "紅心";
      } else if (list.get(i) / 13 == 2) {
        flower = "方塊";
      } else if (list.get(i) / 13 == 3) {
        flower = "梅花";
      }   //end of if()花色

      if (list.get(i) % 13 == 12) {
        flower += "K";
      } else if (list.get(i) % 13 == 11) {
        flower += "Q";
      } else if (list.get(i) % 13 == 10) {
        flower += "J";
      } else if (list.get(i) % 13 == 0) {
        flower += "A";
      } else {
        flower += Integer.toString(list.get(i) % 13 + 1);
      } //end of if()卡牌數字

      System.out.print(flower);
      if (count % 13 == 0) {
        System.out.println();
      } else {
        System.out.print("、");
      }
      count++;

    } //end of for()

  }
}
