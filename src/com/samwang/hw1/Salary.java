package com.samwang.hw1;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		System.out.println("請輸入工作時數:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		double salary;
		if (input <= 60) {
			salary = input * 150;
		} else if (input > 60 && input <= 80) {
			salary = 60 * 150 + (input - 60) * 150 * 1.25;
		} else {
			salary = 60 * 150 + 20 * 150 * 1.25 + (input - 80) * 150 * 1.5;
		}
		System.out.println("薪資為：" + (int) salary + "元");
		
		scanner.close();

	}

}
