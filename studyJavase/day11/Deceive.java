package com.demo.day11;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月27日 下午4:25:57
 */
public class Deceive {

	public static void main(String[] args) {

		Integer i1 = 5;
		Integer i2 = 5;
		// true
		System.out.println(i1 == i2);

		Integer i3 = 128;
		Integer i4 = 128;
		// false
		System.out.println(i3 == i4);

	}

}
