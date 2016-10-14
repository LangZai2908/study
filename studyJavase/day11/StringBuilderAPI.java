package com.demo.day11;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��27�� ����2:51:08
 */
public class StringBuilderAPI {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("�Ұ������찲��");

		print("-----------append����-------------");

		print(sb.append(",�찲����̫����"));

		print("-----------appendCodePoint����-------------");

		print(sb.appendCodePoint(97));

		print("-----------capacity����-------------");

		print(sb.capacity());

		print("-----------codePointCount����-------------");
		print(sb.codePointCount(0, 5));

		print("-----------delete����-------------");
		print(sb.delete(8, sb.length()));

		print("-----------delete����-------------");
		print(sb.deleteCharAt(sb.length() - 1));

		// insert����
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
