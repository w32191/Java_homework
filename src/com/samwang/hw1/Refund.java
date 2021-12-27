package com.samwang.hw1;

import java.util.Scanner;

public class Refund {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入商品應付金額：");
		int price = scanner.nextInt();

		System.out.println("請輸入支付金額");
		int pay = scanner.nextInt();

		if (price > pay) {
			System.out.println("金額不足");
		} else if (price == pay) {
			System.out.println("不必找錢");
		} else {
			int change = pay - price;
			int thousandDollor = 0, fiveHundredDollor = 0, hundredDollar = 0, fiftyDollor = 0, tenDollor = 0,
					fiveDollor = 0, oneDollor = 0;
			String refund = "應找回：";

			thousandDollor = change / 1000;
			change -= thousandDollor * 1000;

			fiveHundredDollor = change / 500;
			change -= fiveHundredDollor * 500;

			hundredDollar = change / 100;
			change -= hundredDollar * 100;

			fiftyDollor = change / 50;
			change -= fiftyDollor * 50;

			tenDollor = change / 10;
			change -= tenDollor * 10;

			fiveDollor = change / 5;
			change -= fiveDollor * 5;

			oneDollor = change / 1;

			if (thousandDollor != 0) {
				refund += thousandDollor + "張一千元,";
			}
			if (fiveHundredDollor != 0) {
				refund += fiveHundredDollor + "張五百元,";
			}
			if (hundredDollar != 0) {
				refund += hundredDollar + "張一百元,";
			}
			if (fiftyDollor != 0) {
				refund += fiftyDollor + "個五十元,";
			}
			if (tenDollor != 0) {
				refund += tenDollor + "個十元,";
			}
			if (fiveDollor != 0) {
				refund += fiveDollor + "個五元,";
			}
			if (oneDollor != 0) {
				refund += oneDollor + "個一元";
			}
			System.out.println(refund);
		}
		scanner.close();
	}

}
