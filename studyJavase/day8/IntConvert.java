package com.demo.day8;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月22日 下午3:54:37
 */
public class IntConvert {

	public static void main(String[] args) {
		long l = 1000l;
		byte b = 1;
		short s = 2;
		int i = 3;
		// 整数计算中
		// 如果有long参与，结果为long
		// 如果没有long参与，结果为int
		long r = l * i;

		int r1 = i * b;
		int r2 = i * s;
		int r3 = b * s;

		double d = 12d;
		float f = 1f;

		// 在double或者float参与的计算就是浮点计算
		// 浮点数计算，如果有double参与，结果是double
		// 如果没有，则是float
		double r4 = d + f;

		float r5 = f + l;
	}

}
