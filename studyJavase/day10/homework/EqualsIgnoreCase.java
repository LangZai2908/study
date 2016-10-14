package com.demo.day10.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月26日 下午4:58:44
 */
public class EqualsIgnoreCase {

	private String str;

	public boolean equalsIgnoreCase(String str) {
		if (this.str == str) {
			return true;
		}
		if (str.equals(null) || this.str.equals(null)) {
			return false;
		}

		if (this.str.toLowerCase().equals(str.toLowerCase())) {
			return true;
		} else {
			return false;
		}

	}

	public EqualsIgnoreCase(String str) {
		super();
		this.str = str;
	}

	public static void main(String[] args) {

		EqualsIgnoreCase hello = new EqualsIgnoreCase("hello");
		System.out.println(hello.equalsIgnoreCase("Hello"));

	}

}
