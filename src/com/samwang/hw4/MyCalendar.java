package com.samwang.hw4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar extends GregorianCalendar {

  private String[] weekDay = {"日", "一", "二", "三", "四", "五", "六"};
  private static int count = 0; //控制星期六印完後，換行用

  //建構子
  //傳給superclass : GregorianCalendar(year,month,day)
  MyCalendar(int year, int month) {
    super(year, month - 1, 1);
  }

  public void printCalendar() {

    //表頭
    for (int i = 0; i < weekDay.length; i++) {
      System.out.print(" "+weekDay[i] );
      if (i == weekDay.length - 1) {
        System.out.println();
      }
    }//end of for(表頭)

    //印每月1號前的空白
    // 用Calender.get(Calendar.DAY_OF_WEEK)取當前星期幾
    for (int i = 0; i < this.get(Calendar.DAY_OF_WEEK) - 1; i++) {
      System.out.print("   ");
      count++;
    }//end if for(第一行空白)

    //GregorianCalendar.getActualMaximum(Calendar.DAY_OF_MONTH)
    //取現在這個Calendar實例設定的日期 之當月最大天數
    for (int i = 1; i <= this.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
      System.out.printf("%2d", i);
      count++;

      //count每印一天++，7的倍數換行
      if (count % 7 == 0) {
        System.out.println();
      } else {
        System.out.print(" ");
      }

    }//end of for()

  }

}
