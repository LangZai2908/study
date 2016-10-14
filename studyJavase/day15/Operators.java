package com.demo.day15;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月8日 下午2:12:37
 */
public class Operators {

	public static void main(String[] args) {
		// mathOperator();
		// ppmm();
		// compare();
		// logical();
		// String str = " ";
		// System.out.println(str.trim().length());

	}

	private static void logical() {
		//
		// // 同为true为true，其他都为false,会短路
		// System.out.println("true && true = " + (true && true));
		// System.out.println("false && true = " + (false && true));
		// System.out.println("true && false = " + (true && false));
		// System.out.println("false && false = " + (false && false));
		//
		// // 只有一个为true就为true，同为false才为false，会短路
		// System.out.println("true || true = " + (true || true));
		// System.out.println("false || true = " + (false || true));
		// System.out.println("true || false = " + (true || false));
		// System.out.println("false || false = " + (false || false));
		//
		// // 同为true为true，其他都为false
		// System.out.println("true & true = " + (true & true));
		// System.out.println("false & true = " + (false & true));
		// System.out.println("true & false = " + (true & false));
		// System.out.println("false & false = " + (false & false));
		//
		// // 只有一个为true就为true，同为false才为false
		// System.out.println("true | true = " + (true | true));
		// System.out.println("false | true = " + (false | true));
		// System.out.println("true | false = " + (true | false));
		// System.out.println("false | false = " + (false | false));
		//
		// // 相同为false，不同为true
		// System.out.println("true ^ true = " + (true ^ true));
		// System.out.println("false ^ true = " + (false ^ true));
		// System.out.println("true ^ false = " + (true ^ false));
		// System.out.println("false ^ false = " + (false ^ false));

		System.out.println(!false && true);
	}

	public static void compare() {
		System.out.println("5 > 3 =" + (5 > 3));
		System.out.println("5 == 3 = " + (5 == 3));
		System.out.println("5 < 3 =" + (5 < 3));
		System.out.println("5 >= 3 = " + (5 >= 3));
		System.out.println("5 <= 3 = " + (5 <= 3));
		System.out.println("5 != 3 = " + (5 != 3));

		System.out.println("'a' == 'f' = " + ('a' == 'f'));
		System.out.println("'a' >= 'f' = " + ('a' >= 'f'));
		System.out.println("'a' <= 'f' = " + ('a' <= 'f'));
		System.out.println("'a' != 'f' = " + ('a' != 'f'));
		System.out.println("'a' < 'f' = " + ('a' < 'f'));
		System.out.println("'a' > 'f' = " + ('a' > 'f'));
	}

	public static void ppmm() {
		int i = 0;
		System.out.println(i++);// 0
		System.out.println(i);// 1
		System.out.println(++i);// 2
		System.out.println(i);// 2
	}

	public static void mathOperator() {
		// 负号
		int a = 5;
		System.out.println("-a=" + -a);
		int b = -5;
		System.out.println("-b=" + -b);
		// 整型
		int c = 5;
		int d = 6;
		System.out.println("c + d = " + (c + d));
		System.out.println("c - d = " + (c - d));
		System.out.println("c * d = " + (c * d));
		System.out.println("c / d = " + (c / d));
		System.out.println("c % d = " + (c % d));
		// float
		float e = 5f;
		float f = 6f;
		System.out.println("e + f = " + (e + f));
		System.out.println("e - f = " + (e - f));
		System.out.println("e * f = " + (e * f));
		System.out.println("e / f = " + (e / f));
		System.out.println("e % f = " + (e % f));
		// double
		double e1 = 5;
		double f1 = 6.15163;
		System.out.println("e1 + f1 = " + (e1 + f1));
		System.out.println("e1 - f1 = " + (e1 - f1));
		System.out.println("e1 * f1 = " + (e1 * f1));
		System.out.println("e1 / f1  = " + (e1 / f1));
		System.out.println("e1 % f1  = " + (e1 % f1));
		// char
		char e11 = 'f';
		char f11 = 'e';
		System.out.println("e11 + f11 = " + (e11 + f11));
		System.out.println("e11 - f11 = " + (e11 - f11));
		System.out.println("e11 * f11 = " + (e11 * f11));
		System.out.println("e11 / f11 = " + (e11 / f11));
	}

}
