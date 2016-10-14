package com.demo.day15.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月8日 下午5:13:34
 */
public class Operator {

	public static void main(String[] args) {
		// operator(5, 8);
		// operator(5.54, 8.14);
		// operator('w', 'm');
		// operator(true, false);

		// ppmm();
		String str = "";
		System.out.println(isBlank(str));

	}

	private static boolean isBlank(String str) {

		// 方法一
		// return str == null || str.length() == 0 || str.replaceAll(" ", "").length() == 0;

		// 方法二
		// return str == null || str.length() == 0 ||  str.trim().length() == 0;

		// 方法三
		if (str == null || str.length() == 0) {
			return true;
		}
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;

	}

	private static void ppmm() {
		int i = 3;

		int sum = 0;

		sum = (i++) + (i--) * (i++) + (++i) + (i++) * (--i) + (++i);
		System.out.println(sum);

	}

	private static void operator(int i, int j) {
		System.out.println(i + " + " + j + " = " + (i + j));
		System.out.println(i + " - " + j + " = " + (i - j));
		System.out.println(i + " * " + j + " = " + (i * j));
		System.out.println(i + " / " + j + " = " + (i / j));
		System.out.println(i + " % " + j + " = " + (i % j));
	}

	private static void operator(double i, double j) {
		System.out.println(i + " + " + j + " = " + (i + j));
		System.out.println(i + " - " + j + " = " + (i - j));
		System.out.println(i + " * " + j + " = " + (i * j));
		System.out.println(i + " / " + j + " = " + (i / j));
		System.out.println(i + " % " + j + " = " + (i % j));
	}

	private static void operator(char i, char j) {
		System.out.println(i + " + " + j + " = " + (i + j));
		System.out.println(i + " - " + j + " = " + (i - j));
		System.out.println(i + " * " + j + " = " + (i * j));
		System.out.println(i + " / " + j + " = " + (i / j));
		System.out.println(i + " % " + j + " = " + (i % j));
	}

	private static void operator(boolean i, boolean j) {
		System.out.println(i + " == " + j + " = " + (i == j));
		System.out.println(i + " != " + j + " = " + (i != j));
		System.out.println(i + " || " + j + " = " + (i || j));
		System.out.println(i + " && " + j + " = " + (i && j));
		System.out.println(i + " ^ " + j + " = " + (i ^ j));
	}

}
