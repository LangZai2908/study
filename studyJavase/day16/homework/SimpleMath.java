package com.demo.day16.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午5:13:24
 */
public class SimpleMath {

	public static void main(String[] args) {
		simpleMath();

	}

	public static void simpleMath() {
		Scanner in = new Scanner(System.in);
		System.out.print("输入的第一个数：");
		int i = in.nextInt();
		System.out.print("输入的第二个数：");
		int j = in.nextInt();
		in.close();
		if (i == 8 && j == 9) {
			System.out.println(i + j);
		} else {
			System.out.println(i - j);
		}
	}

}
