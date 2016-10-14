package com.demo.day10.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月26日 下午5:20:05
 */
public class Change {

	private String str;

	private Scanner control;

	public void getName() {
		// 方法一：
		// int temp = control.nextInt();
		// if (temp == 2) {
		// String name = this.str.substring(0, 2);
		// print("*姓名：" + name);
		// } else if (temp == 3) {
		// String name1 = this.str.substring(0, 3);
		// print("*姓名：" + name1);
		// }

		// 方法二：
		int site = str.indexOf("今年");
		char[] name = str.toCharArray();
		print("*姓名：" + new String(name, 0, site));
	}

	public void getAge() {
		int site = str.indexOf("今年");
		int site1 = str.indexOf("岁");
		char[] name = str.toCharArray();
		print("*年龄：" + new String(name, site + 2, site1 - site - 2));
	}

	public void getHome() {
		int siteStart = str.indexOf("家乡是");
		int siteEnd = str.indexOf("人");
		char[] name = str.toCharArray();
		print("*家乡：" + new String(name, siteStart + 3, siteEnd - siteStart - 1));

	}

	public void getInterest() {
		int site0 = str.indexOf("爱好");
		int site1 = str.indexOf("、");
		if (site1 > 0) {
			for (int i = 0; site1 < site0; i++) {
				site1 = str.indexOf(str, site1 + 1);
			}
		}
		int site2 = str.indexOf("和");
		if (site2 > 0) {
			for (int i = 0; site2 < site0; i++) {
				site2 = str.indexOf(str, site2 + 1);
			}
		}
		char[] name = str.toCharArray();
		if (site1 != -1) {
			print("*爱好：" + new String(name, site0 + 2, site1 - (site0 + 2)) + "、"
					+ new String(name, site1 + 1, site2 - (site1 + 1)) + "和"
					+ new String(name, site2 + 1, name.length - (site2 + 1)));
		} else if (site1 == -1 && site2 != -1) {
			print("*爱好：" + new String(name, site0 + 2, site2 - (site0 + 2)) + "和"
					+ new String(name, site2 + 1, name.length - (site2 + 1)));
		} else if (site1 == -1 && site2 == -1) {
			print("*爱好：" + new String(name, site2 + 1, name.length - (site2 + 1)));

		}
	}

	public Change(String str) {
		this.str = str;
		control = new Scanner(System.in);
		this.getName();
		this.getAge();
		this.getHome();
		this.getInterest();
	}

	public static void main(String[] args) {

		Change str = new Change("刘湘今年23岁家乡是重庆钢梁人爱好运动和Java");
		print("--------------------------------");
		Change str1 = new Change("陈昌建今年24岁家乡是重庆梁平人爱好游戏、Java和小说");

		String c = deleteWhitespace("陈昌建今 年24岁家 乡是重庆  平人 爱好游戏、J ava和小说");
		System.out.println(c);
	}

	private static String deleteWhitespace(String str) {
		String[] b = str.split(" ");
		String c = "";
		for (int i = 0; i < b.length; i++) {
			c += b[i];
		}
		return c;
	}

	private static void print(String str) {
		System.out.println(str);
	}

}
