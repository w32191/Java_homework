package com.samwang.hw4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar extends GregorianCalendar {

  private String[] weekDay = {"日", "一", "二", "三", "四", "五", "六"};
  private int dayOfWeek;
  private static int count = 0;

  MyCalendar(int year, int month) {
    super(year, month - 1, 1);
    this.dayOfWeek = this.get(Calendar.DAY_OF_WEEK);
  }

  public void printCalendar() {

    //表頭
    for (int i = 0; i < weekDay.length; i++) {
      System.out.print(" "+weekDay[i] );
      if (i == weekDay.length - 1) {
        System.out.println();
      }
    }//end of for()表頭

    for (int i = 0; i < dayOfWeek - 1; i++) {
      System.out.print("   ");
      count++;
    }
    for (int i = 1; i <= this.getActualMaximum(Calendar.DATE); i++) {
      System.out.printf("%2d", i);
      count++;
      if (count % 7 == 0) {
        System.out.println();
        count = 0;
      } else {
        System.out.print(" ");
      }

    }

  }

}
