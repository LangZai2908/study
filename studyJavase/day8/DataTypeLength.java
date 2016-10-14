package com.demo.day8;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月22日 下午2:26:09
 */
public class DataTypeLength {

	public static void main(String[] args) {

		int x = 5;
		Integer x1 = 5;
		System.out.println(x1.MAX_VALUE);

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Float.MIN_VALUE + "~" + Float.MAX_VALUE);

		System.out.println((int) Character.MIN_VALUE + "~" + (short) Character.MAX_VALUE);

	}

}
