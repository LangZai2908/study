package com.demo.day16.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��9�� ����5:17:44
 */
public class Operator {

	public static void main(String[] args) {
		operator();

	}

	private static void operator() {
		Scanner in = new Scanner(System.in);
		System.out.print("����ĵ�һ������");
		int i = in.nextInt();
		System.out.print("����ĵڶ�������");
		int j = in.nextInt();
		System.out.print("������ţ�");
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
