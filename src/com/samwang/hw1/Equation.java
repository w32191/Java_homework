package com.samwang.hw1;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		System.out.println("a:");
		a = scanner.nextInt();
		System.out.println("b:");
		b = scanner.nextInt();
		System.out.println("c:");
		c = scanner.nextInt();

		double condition = b * b - 4 * a * c;
		if (condition > 0) {
			double result1, result2;
			result1 = (-b + Math.sqrt(condition)) / 2 * a;
			result2 = (-b - Math.sqrt(condition)) / 2 * a;
			System.out.println("實根為" + result1 + " & " + result2);
		} else if (condition == 0) {
			double result = -b / 2 * a;
			System.out.println("實根為" + result);
		} else {
			System.out.println("沒有實根");
		}
		scanner.close();
	}
}
