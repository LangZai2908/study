package com.demo.day16;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午3:05:44
 */
public class Work {

	public static void main(String[] args) {
		// compare();
		calculate();
	}

	private static void calculate() {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入第一个数字：");
		int i = in.nextInt();
		System.out.print("请输入第二个数字：");
		int j = in.nextInt();
		System.out.print("请输入运算符：");
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
		System.out.print("请输入第一个数字：");
		int i = in.nextInt();
		System.out.print("\n请输入第二个数字：");
		int j = in.nextInt();
		in.close();
		if (i > j) {
			System.out.println("\n其中较大的数为：" + i);
		} else {
			System.out.println("\n其中较大的数为：" + j);
		}
	}

}
