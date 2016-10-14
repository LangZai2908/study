package com.demo.day8;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月22日 上午11:13:12
 */
public class TestDataType {

	public static void main(String[] args) {

		// 整型
		byte b = 1 * 2;
		byte a = b;
		System.out.println(b);
		System.out.println(a);
		System.out.println(a == b);

		short s = 1000;
		System.out.println("短整型：" + s);
		int i = 1000000000;
		System.out.println("整型：" + i);
		long l = 1000000000L;
		System.out.println("长整型：" + l);

		// 浮点型
		double d = 10.0000;
		double d1 = 1500.00;
		System.out.println("双精度型：" + d);
		System.out.println("双精度型：" + d1);

		float f = 10.00f;
		float f1 = 10.00F;
		System.out.println("单精度型：" + f1);
		System.out.println("单精度型：" + f1);

		// 字符型
		char c = 'd';
		char c1 = 'f';
		char c2 = '含';
		System.out.println("字符型：" + c2);
		System.out.println((char) 38472);

		// 布尔型
		boolean isNice = true;
		boolean isBad = false;

		System.out.println("布尔型" + isNice);
		System.out.println("布尔型" + isBad);

		int b1 = 10000000;
		// 编译不通过
		// byte c == b;

		float f11 = 1000f;
		double d11 = f11;

		double d2 = 10000.00;
		// 编译不通过
		// float f2 = d2;

		char c12 = 'a';
		int i1 = c12;
		// 编译不通过
		// short s = c;
		long l1 = c;

		int i2 = -1000;
		float f21 = i2;
		System.out.println(f21);

		short short1 = 32767;
		byte byte1 = 51;
		int long2 = byte1 * short1;

		for (int j = 0; j < 10; j++) {
			System.out.println((byte) (++short1));

		}

	}

}
