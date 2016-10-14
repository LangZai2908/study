package com.demo.day11;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月27日 下午2:51:08
 */
public class StringBuilderAPI {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("我爱北京天安门");

		print("-----------append方法-------------");

		print(sb.append(",天安门上太阳升"));

		print("-----------appendCodePoint方法-------------");

		print(sb.appendCodePoint(97));

		print("-----------capacity方法-------------");

		print(sb.capacity());

		print("-----------codePointCount方法-------------");
		print(sb.codePointCount(0, 5));

		print("-----------delete方法-------------");
		print(sb.delete(8, sb.length()));

		print("-----------delete方法-------------");
		print(sb.deleteCharAt(sb.length() - 1));

		// insert方法
		sb.insert(0, "112321345\n");
		sb.insert(0, "5154321,");
		print(sb);

	}

	public static void print(StringBuilder str) {
		System.out.println(str);
	}

	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(int str) {
		System.out.println(str);
	}

}
