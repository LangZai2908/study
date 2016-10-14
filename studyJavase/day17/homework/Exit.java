package com.demo.day17.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午5:01:49
 */
public class Exit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入");
		while (!in.next().equals("exit")) {
			System.out.println("请继续输入");
		}
		in.close();
	}

}
