package com.demo.day17.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����5:01:49
 */
public class Exit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������");
		while (!in.next().equals("exit")) {
			System.out.println("���������");
		}
		in.close();
	}

}
