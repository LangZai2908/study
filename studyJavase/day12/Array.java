package com.demo.day12;

import java.util.Arrays;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月28日 上午11:34:30
 */
public class Array {

	private static String[] names = { "胡帅", "刘湘", "张郊", "罗信", "刘发及", "龙科宇", "陈昌建", "曹龄", "李奥", "胡小祥", "黄林玲", "顾渐旭",
			"李南轩", "张少阳", "刘敬东", "封延超", "但奎勇", "施龙飞", "廖兵", "杨森", "宋阳", "原剑", "林蜀杰", "黄鑫", "刘江来", "熊春颖", "李胜利", "倪思阳" };

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

	// 传值
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
		names[22] = "23-麦子";
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
