package com.demo.day16.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��9�� ����5:13:24
 */
public class SimpleMath {

	public static void main(String[] args) {
		simpleMath();

	}

	public static void simpleMath() {
		Scanner in = new Scanner(System.in);
		System.out.print("����ĵ�һ������");
		int i = in.nextInt();
		System.out.print("����ĵڶ�������");
		int j = in.nextInt();
		in.close();
		if (i == 8 && j == 9) {
			System.out.println(i + j);
		} else {
			System.out.println(i - j);
		}
	}

}
