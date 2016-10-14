package com.demo.day10.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��26�� ����5:20:05
 */
public class Change {

	private String str;

	private Scanner control;

	public void getName() {
		// ����һ��
		// int temp = control.nextInt();
		// if (temp == 2) {
		// String name = this.str.substring(0, 2);
		// print("*������" + name);
		// } else if (temp == 3) {
		// String name1 = this.str.substring(0, 3);
		// print("*������" + name1);
		// }

		// ��������
		int site = str.indexOf("����");
		char[] name = str.toCharArray();
		print("*������" + new String(name, 0, site));
	}

	public void getAge() {
		int site = str.indexOf("����");
		int site1 = str.indexOf("��");
		char[] name = str.toCharArray();
		print("*���䣺" + new String(name, site + 2, site1 - site - 2));
	}

	public void getHome() {
		int siteStart = str.indexOf("������");
		int siteEnd = str.indexOf("��");
		char[] name = str.toCharArray();
		print("*���磺" + new String(name, siteStart + 3, siteEnd - siteStart - 1));

	}

	public void getInterest() {
		int site0 = str.indexOf("����");
		int site1 = str.indexOf("��");
		if (site1 > 0) {
			for (int i = 0; site1 < site0; i++) {
				site1 = str.indexOf(str, site1 + 1);
			}
		}
		int site2 = str.indexOf("��");
		if (site2 > 0) {
			for (int i = 0; site2 < site0; i++) {
				site2 = str.indexOf(str, site2 + 1);
			}
		}
		char[] name = str.toCharArray();
		if (site1 != -1) {
			print("*���ã�" + new String(name, site0 + 2, site1 - (site0 + 2)) + "��"
					+ new String(name, site1 + 1, site2 - (site1 + 1)) + "��"
					+ new String(name, site2 + 1, name.length - (site2 + 1)));
		} else if (site1 == -1 && site2 != -1) {
			print("*���ã�" + new String(name, site0 + 2, site2 - (site0 + 2)) + "��"
					+ new String(name, site2 + 1, name.length - (site2 + 1)));
		} else if (site1 == -1 && site2 == -1) {
			print("*���ã�" + new String(name, site2 + 1, name.length - (site2 + 1)));

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

		Change str = new Change("�������23���������������˰����˶���Java");
		print("--------------------------------");
		Change str1 = new Change("�²�������24�������������ƽ�˰�����Ϸ��Java��С˵");

		String c = deleteWhitespace("�²����� ��24��� ��������  ƽ�� ������Ϸ��J ava��С˵");
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
