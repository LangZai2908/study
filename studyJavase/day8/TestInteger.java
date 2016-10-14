package com.demo.day8;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月22日 下午2:57:38
 */
public class TestInteger {

	public static void main(String[] args) {

		byte b = 53;
		short s = b;
		// 编译不通过
		// b = s;

		short s1 = 451;
		int i = s1;
		// 编译不通过
		// s1=i;

		int i1 = 351351315;
		long l = i1;
		// 编译不通过
		// i1= l;

		float f = 2135.2315f;
		double d = f;
		// 编译不通过
		// f=d;

	}

}
