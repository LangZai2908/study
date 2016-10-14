package com.demo.day16.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午5:17:44
 */
public class Operator {

	public static void main(String[] args) {
		operator();

	}

	private static void operator() {
		Scanner in = new Scanner(System.in);
		System.out.print("输入的第一个数：");
		int i = in.nextInt();
		System.out.print("输入的第二个数：");
		int j = in.nextInt();
		System.out.print("输入符号：");
		String str = in.next();
		in.close();
		switch (str) {
		case "+":
			System.out.println(i + str + j + "=" + (i + j));
			break;
		case "-":
			System.out.println(i + str + j + "=" + (i - j));
			break;
		case "*":
			System.out.println(i + str + j + "=" + (i * j));
			break;
		case "/":
			System.out.println(i + str + j + "=" + (i / j));
			break;
		case "%":
			System.out.println(i + str + j + "=" + (i % j));
			break;
		}
	}

}
