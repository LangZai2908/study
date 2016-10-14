package com.demo.day10;

import java.util.Arrays;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��26�� ����3:06:13
 */
public class StringConstructor {

	public static void main(String[] args) {
		// construtor();
		// compare();
		search();
		// extract();
		convert();
	}

	// ��Сдת��
	private static void convert() {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		print(str.toUpperCase());
		print(str.toLowerCase());
	}

	// ��ȡ�ַ���
	private static void extract() {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		print("str.charAt(6):" + str.charAt(6));

		print("str.substring(13):" + str.substring(13));
		// 0.ǰ���󲻰���1.������0��ʼ
		print("str.substring(13,18):" + str.substring(13, 18));

		print("+���ӣ�" + "hello" + "world");
		print("concat�������ӣ�" + "hello".concat("world"));

		String longest = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		print("replace('o', 'x')" + longest.replace('o', 'x'));
		print("replace" + longest.replace("Pneumonoultramicroscopicsilicovolcanoconiosis", "1"));
		print("replaceFirst" + longest.replaceFirst("o", "4567"));
		// replaceAll ֧��������ʽ��replace��֧��
		print("replaceAll" + longest.replaceAll("o", "4"));
		String toTrim = "   xxx   yyy   ";
		System.out.println("Trim:" + "$" + toTrim.trim() + "$");
	}

	// �����ַ���
	private static void search() {
		String str = "Pneumonoultramicroscopicsilicovolcanoconiosis";
		// ����һ�����ڵ��ַ�
		print("indexOf(n):" + str.indexOf('n'));
		// ����һ�������ڵ��ַ�
		print("indexOf(z):" + str.indexOf('z'));
		// ����һ�����ڵ��ַ������Ǵ�ָ����������ʼ
		print("indexOf(n,3):" + str.indexOf('n', 3));
		// ����һ�����ڵ��ַ���
		print("indexOf(micro):" + str.indexOf("micro"));
		// ����һ�������ڵ��ַ���
		print("indexOf(z):" + str.indexOf("z"));
		// ����һ�����ڵ��ַ��������Ǵ�ָ����������ʼ
		print("indexOf(micro,14):" + str.indexOf("micro", 14));

		// �ж��ַ������ж��ٸ�n
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf('n', i) != str.indexOf('n', i - 1)) {
				count++;
			}
		}
		System.out.println("�ַ�����" + count + "��n");
		// �Ӻ���ǰ����һ�����ڵ��ַ�����������
		print("lastIndexOf(n):" + str.lastIndexOf('n'));
		// �Ӻ���ǰ����һ�������ڵ��ַ�����������
		print("lastIndexOf(z):" + str.lastIndexOf('z'));
		// ��ָ������������ʼ�Ӻ���ǰ����һ�����ڵ��ַ�����������
		print("lastIndexOf(n��3):" + str.lastIndexOf('n', 3));
		// �Ӻ���ǰ����һ�����ڵ��ַ�������������
		print("lastIndexOf(n):" + str.lastIndexOf("n"));
		// �Ӻ���ǰ����һ�������ڵ��ַ�������������
		print("lastIndexOf(z):" + str.lastIndexOf("z"));
		// ��ָ������������ʼ�Ӻ���ǰ����һ�����ڵ��ַ�������������
		print("lastIndexOf(n��3):" + str.lastIndexOf("n", 3));

		print("str.contains(\"micro\"):" + str.contains("micro"));
		print("str.contains(\"soft\"):" + str.contains("soft"));

	}

	// ����String�Ĺ��췽��
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

	// ����String�ıȽϷ���
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

	// -----------------��ӡ���߷���---------------
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
