package com.demo.day16;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��9�� ����3:05:44
 */
public class Work {

	public static void main(String[] args) {
		// compare();
		calculate();
	}

	private static void calculate() {
		Scanner in = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		int i = in.nextInt();
		System.out.print("������ڶ������֣�");
		int j = in.nextInt();
		System.out.print("�������������");
		String str = in.next();
		in.close();
		if (str.equals("+")) {
			System.out.println(i + str + j + "=" + (i + j));
		} else if (str.equals("-")) {
			System.out.println(i + str + j + "=" + (i - j));
		} else if (str.equals("*")) {
			System.out.println(i + str + j + "=" + (i * j));
		} else if (str.equals("/")) {
			System.out.println(i + str + j + "=" + (i / j));
		} else if (str.equals("%")) {
			System.out.println(i + str + j + "=" + (i % j));
		}

	}

	private static void compare() {
		Scanner in = new Scanner(System.in);
		System.out.print("�������һ�����֣�");
		int i = in.nextInt();
		System.out.print("\n������ڶ������֣�");
		int j = in.nextInt();
		in.close();
		if (i > j) {
			System.out.println("\n���нϴ����Ϊ��" + i);
		} else {
			System.out.println("\n���нϴ����Ϊ��" + j);
		}
	}

}
