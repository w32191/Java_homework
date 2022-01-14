package com.samwang.hw1;

import java.util.Scanner;

public class LeapYear {

  public static boolean isLeapYearOrNot(int year) {

    if (year % 400 == 0) {
      //每四百年一閏
      return true;
    } else //每四年一閏
      if (year % 100 == 0) {
        //每百年不閏
        return false;
      } else {
        return year % 4 == 0;
      }
  }
}
