package com.samwang.hw3;

import java.util.Scanner;

public class Rain {

  public static void main(String[] args) {
//    double[][][] rain = new double[5][4][3];
    double[][][] rain = {
        {{1.1, 2.2, 3.3}}, {{4.4, 5.5, 6.6}}, {{7.7, 8.8, 9.9}}, {{10.10, 11.11, 12.12}},
        {{13.13, 14.14, 15.15}}, {{16.16, 17.17, 18.18}}, {{19.19, 20.20, 21.21}},
        {{22.22, 23.23, 24.24}},
        {{25.25, 26.26, 27.27}}, {{28.28, 29.29, 30.30}}, {{31.31, 32.32, 33.33}},
        {{34.34, 35.35, 36.36}},
        {{37.37, 38.38, 39.39}}, {{40.40, 41.41, 42.42}}, {{43.43, 44.44, 45.45}},
        {{46.46, 47.47, 48.48}},
        {{49.49, 50.50, 51.51}}, {{52.52, 53.53, 54.54}}, {{55.55, 56.56, 57.57}},
        {{58.58, 59.59, 60.60}}
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
            System.out.println("count=" + count);
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
