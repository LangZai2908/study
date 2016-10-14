package com.demo.day10;

import java.util.Arrays;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月26日 下午3:06:13
 */
public class StringConstructor {

	public static void main(String[] args) {
		// construtor();
		// compare();
		search();
		// extract();
		convert();
	}

	// 大小写转换
	private static void convert() {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		print(str.toUpperCase());
		print(str.toLowerCase());
	}

	// 提取字符串
	private static void extract() {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		print("str.charAt(6):" + str.charAt(6));

		print("str.substring(13):" + str.substring(13));
		// 0.前包后不包，1.索引从0开始
		print("str.substring(13,18):" + str.substring(13, 18));

		print("+连接：" + "hello" + "world");
		print("concat方法连接：" + "hello".concat("world"));

		String longest = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		print("replace('o', 'x')" + longest.replace('o', 'x'));
		print("replace" + longest.replace("Pneumonoultramicroscopicsilicovolcanoconiosis", "1"));
		print("replaceFirst" + longest.replaceFirst("o", "4567"));
		// replaceAll 支持正则表达式但replace不支持
		print("replaceAll" + longest.replaceAll("o", "4"));
		String toTrim = "   xxx   yyy   ";
		System.out.println("Trim:" + "$" + toTrim.trim() + "$");
	}

	// 搜索字符串
	private static void search() {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		// 搜索一个存在的字符
		print("indexOf(n):" + str.indexOf('n'));
		// 搜索一个不存在的字符
		print("indexOf(z):" + str.indexOf('z'));
		// 搜索一个存在的字符，但是从指定的索引开始
		print("indexOf(n,3):" + str.indexOf('n', 3));
		// 搜索一个存在的字符串
		print("indexOf(micro):" + str.indexOf("micro"));
		// 搜索一个不存在的字符串
		print("indexOf(z):" + str.indexOf("z"));
		// 搜索一个存在的字符串，但是从指定的索引开始
		print("indexOf(micro,14):" + str.indexOf("micro", 14));

		// 判断字符串中有多少个n
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf('n', i) != str.indexOf('n', i - 1)) {
				count++;
			}
		}
		System.out.println("字符中有" + count + "个n");
		// 从后往前搜索一个存在的字符，返回索引
		print("lastIndexOf(n):" + str.lastIndexOf('n'));
		// 从后往前搜索一个不存在的字符，返回索引
		print("lastIndexOf(z):" + str.lastIndexOf('z'));
		// 从指定的索引处开始从后往前搜索一个存在的字符，返回索引
		print("lastIndexOf(n，3):" + str.lastIndexOf('n', 3));
		// 从后往前搜索一个存在的字符串，返回索引
		print("lastIndexOf(n):" + str.lastIndexOf("n"));
		// 从后往前搜索一个不存在的字符串，返回索引
		print("lastIndexOf(z):" + str.lastIndexOf("z"));
		// 从指定的索引处开始从后往前搜索一个存在的字符串，返回索引
		print("lastIndexOf(n，3):" + str.lastIndexOf("n", 3));

		print("str.contains(\"micro\"):" + str.contains("micro"));
		print("str.contains(\"soft\"):" + str.contains("soft"));

	}

	// 测试String的构造方法
	private static void construtor() {
		String copy = new String("xxxx");
		print(copy);

		char[] charArray = { 'h', 'i', 'm', 'o', 'm' };
		String hello = new String(charArray);
		print(hello);

		char[] charArr = copy.toCharArray();
		String copyCharArray = new String(charArr);
		print(copyCharArray);

		byte[] bytes = "hello".getBytes();
		String byteArray = new String(bytes);
		System.out.println(byteArray);
	}

	// 测试String的比较方法
	private static void compare() {
		String a = "hello";
		String b = "hello";
		print("a equals b " + a.equals(b));
		print("a + equals b" + (a + ",world").equals(b));

		String c = "Hello";
		print("a equals c " + a.equals(c));
		print("a equalsIgnoreCase c " + a.equalsIgnoreCase(c));

		String a1 = "a";
		String aa1 = "a";
		String b1 = "c";
		String c1 = "C";
		print("a1.compareTo(b1)\t" + a1.compareTo(b1));
		print("a1.compareToIgnoreCase(c1)\t" + a1.compareToIgnoreCase(c1));

		print("---------------startsWith------------------");
		String hello = "hello";
		print(hello.startsWith("h"));
		print(hello.startsWith("he"));
		print(hello.startsWith("hello"));
		print(hello.startsWith("hellow"));
		print(hello.startsWith("h", 1));
		print(hello.startsWith("h", 0));
		print(hello.startsWith("hello", 0));

		print("---------------endsWith------------------");
		String world = "world";
		print(world.endsWith("d"));
		print(world.endsWith("ld"));
		print(world.endsWith("world"));
		print(world.endsWith("jworld"));

	}

	// -----------------打印工具方法---------------
	private static void print(int b) {
		System.out.println(b);

	}

	private static void print(String s) {
		System.out.println(s);
	}

	private static void print(boolean b) {
		System.out.println(b);
	}
}
