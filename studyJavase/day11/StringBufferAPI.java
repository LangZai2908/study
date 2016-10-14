package com.demo.day11;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月27日 下午2:33:42
 */
public class StringBufferAPI {

	public static void main(String[] args) {
		amendStringBuffer();

	}

	private static void amendStringBuffer() {
		// append方法
		StringBuffer s = new StringBuffer();
		s.append('w');
		char[] c = { 'o', 'r', 'l', 'd' };
		s.append(c);
		s.append("hello");

		s.append(1);
		s.append(1.2f);
		System.out.println(s);

		// reverse方法
		s.reverse();
		System.out.println(s);
		s.reverse();

		// insert方法
		s.insert(10, '!');
		s.insert(11, 10);
		System.out.println(s);

		// deleteCharAt与delete方法
		s.deleteCharAt(11);
		System.out.println(s);
		s.delete(11, s.length());
		System.out.println(s);
	}

}
