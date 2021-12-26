package com.samwang.hw3;

import java.util.Scanner;

public class Rain {

  public static void main(String[] args) {
//    double[][][] rain = new double[5][4][3];
    double[][][] rain = {
        {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}, {7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}},
        {{13.0, 14.0, 15.0}, {16.0, 17.0, 18.0}, {19.0, 20.0, 21.0}, {22.0, 23.0, 24.0}},
        {{25.0, 26.0, 27.0}, {28.0, 29.0, 30.0}, {31.0, 32.0, 33.0}, {34.0, 35.0, 36.0}},
        {{37.0, 38.0, 39.0}, {40.0, 41.0, 42.0}, {43.0, 44.0, 45.0}, {46.0, 47.0, 48.0}},
        {{49.0, 50.0, 51.0}, {52.0, 53.0, 54.0}, {55.0, 56.0, 57.0}, {58.0, 59.0, 60.0}}
    };

    Scanner scanner = new Scanner(System.in);
    String inputHint = "Please input \"all\"、\"year\"、\"season\" or \"month\":";
    System.out.println(inputHint);
    String inputString = scanner.nextLine();

    int inputYear, inputSeason, inputMonth;
    double allSum = 0, yearSum = 0, seasonSum = 0, monthSum = 0;
    double yearAvg, seasonAvg, monthAvg;
    int count;

    switch (inputString) {
      case "all":
        //all
        for (int i = 0; i < rain.length; i++) {
          for (int j = 0; j < rain[i].length; j++) {
            for (int k = 0; k < rain[i][j].length; k++) {
              allSum += rain[i][j][k];
            }
          }
        }
        System.out.printf("ALL Sum: %.2f", allSum);
        break;

      //year
      case "year":
        do {
          System.out.println("請輸入年份(1~5):");
          inputYear = scanner.nextInt();
        } while (inputYear > 5 || inputYear < 1);
        count = 0;

        //加總一整年的月份
        for (int season = 0; season < rain[inputYear - 1].length; season++) {
          for (int month = 0; month < rain[inputYear - 1][season].length; month++) {
            yearSum += rain[inputYear - 1][season][month];
            count++;
          }
        }

        yearAvg = yearSum / count;

        System.out.printf("Year Avg: %.2f", yearAvg);
        break;

      //season
      case "season":
        do {
          System.out.print("請輸入季節(1~4):");
          inputSeason = scanner.nextInt();
        } while (inputSeason > 4 || inputSeason < 1);
        count = 0;

        for (int year = 0; year < rain.length; year++) {
          for (int month = 0; month < rain[year][inputSeason - 1].length; month++) {
            seasonSum += rain[year][inputSeason - 1][month];
            count++;
          }
        }
        seasonAvg = seasonSum / count;
        System.out.printf("Season Avg: %.2f", seasonAvg);
        break;

      //month
      case "month":
        do {
          System.out.print("請輸入月份(1~12):");
          inputMonth = scanner.nextInt();
        } while (inputMonth > 12 || inputMonth < 1);
        count = 0;

        for (int year = 0; year < rain.length; year++) {
          for (int season = 0; season < rain[year].length; season++) {
            monthSum += rain[year][season][(inputMonth - 1) / 4];
            count++;
          }
        }
        monthAvg = monthSum / count;
        System.out.printf("month Avg: %.2f", monthAvg);
        break;

      default:
        System.out.println(inputHint);
    } //end of switch


  }
}
