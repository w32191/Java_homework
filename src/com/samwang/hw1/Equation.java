package com.samwang.hw1;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ax^2 + bx + c = 0");

		int a, b, c;
		System.out.println("請輸入a:");
		a = scanner.nextInt();
		System.out.println("請輸入b:");
		b = scanner.nextInt();
		System.out.println("請輸入c:");
		c = scanner.nextInt();

		double condition = b * b - 4 * a * c;

		if (condition > 0) {
			// 有兩個實根
			double result1, result2;
			result1 = (-b + Math.sqrt(condition)) / 2 * a;
			result2 = (-b - Math.sqrt(condition)) / 2 * a;
			System.out.println("x為" + result1 + " & " + result2);
		} else if (condition == 0) {
			//只有一個實根
			double result = -b / (2 * a);
			System.out.println("x為" + result);
		} else {
			System.out.println("沒有實根");
		}
		scanner.close();
	}
}
