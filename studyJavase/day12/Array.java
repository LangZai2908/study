package com.demo.day12;

import java.util.Arrays;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��28�� ����11:34:30
 */
public class Array {

	private static String[] names = { "��˧", "����", "�Ž�", "����", "������", "������", "�²���", "����", "���", "��С��", "������", "�˽���",
			"������", "������", "������", "���ӳ�", "������", "ʩ����", "�α�", "��ɭ", "����", "ԭ��", "�����", "����", "������", "�ܴ�ӱ", "��ʤ��", "��˼��" };

	public static void main(String[] args) {

		// arrayState();
		// declare();
		given();
		fill();

	}

	private static void fill() {

		int[] s = new int[10];
		for (int i = 0; i < s.length; i++) {
			s[i] = i * 2;
		}
		System.out.println(Arrays.toString(s));

		Arrays.fill(s, 1);
		System.out.println(Arrays.toString(s));

		System.out.println("==================");

		String[] stringArr = { "hello", "my", "Java", "world" };
		for (int i = 0; i < stringArr.length; i++) {
			System.out.println(stringArr[i]);
		}
		System.out.println("===================");

		int idx = 0;
		for (String a : stringArr) {
			System.out.println(a);
			a = a + "s";
			idx++;
		}
		System.out.println(Arrays.toString(stringArr));

	}

	// ��ֵ
	private static void given() {
		int[] a = { 1, 2, 6, 5, 100000 };
		int[] b = a;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		b[3] = 8888;
		System.out.println(a[3]);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		Goods g1 = new Goods();
		Goods g2 = g1;
		g2.setX(10);
		System.out.println(g1.getX());

		System.out.println(a.length);

	}

	private static void arrayState() {
		char[] charArr = new char[10];
		System.out.println(names[0]);
		System.out.println(names[22]);
		names[22] = "23-����";
		System.out.println(names[22]);
		System.out.println(Arrays.toString(names));

		Goods[] goodsArr = { new Goods(), new Goods() };

		goodsArr[1] = new Goods();
		Goods g = new Goods();
		float[] floatArr = { 1.56f, 54.44f, 154.41f };
	}

	public static void declare() {

		int[] a = new int[10];
		System.out.println(Arrays.toString(a));

		Goods b[] = new Goods[10];
		b[5] = new Goods();
		System.out.println(Arrays.toString(b));

		int[] c = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(c));

		int[] d = new int[] { 6, 7, 8, 9 };
		System.out.println(Arrays.toString(d));

		a[0] = 199;
		a[2] = 20000;
		a[3] = 1998;
		System.out.println(Arrays.toString(a));
	}

}
