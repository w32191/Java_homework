package com.samwang.hw1;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入月份(1~12月)：");
		int input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("春天");
			break;
		case 2:
			System.out.println("春天");
			break;
		case 3:
			System.out.println("春天");
			break;
		case 4:
			System.out.println("夏天");
			break;
		case 5:
			System.out.println("夏天");
			break;
		case 6:
			System.out.println("夏天");
			break;
		case 7:
			System.out.println("秋天");
			break;
		case 8:
			System.out.println("秋天");
			break;
		case 9:
			System.out.println("秋天");
			break;
		case 10:
			System.out.println("冬天");
			break;
		case 11:
			System.out.println("冬天");
			break;
		case 12:
			System.out.println("冬天");
			break;

		default:
			System.out.println("輸入錯誤");
		}
		
		scanner.close();

	}

}
