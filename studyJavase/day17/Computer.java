package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午3:52:33
 */
public class Computer {
	public static String company = "Apple";

	private String sn;

	private static int counter;

	public Computer() {
		counter++;
	}

	public static int getCounter() {
		return counter;
	}

	public static void start() {
		System.out.println("建立品牌:" + company);
	}
}
