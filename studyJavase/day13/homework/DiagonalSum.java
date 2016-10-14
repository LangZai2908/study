package com.demo.day13.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月29日 下午4:54:22
 */
public class DiagonalSum {

	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		diagonalSum(a);

	}

	private static void diagonalSum(int[][] Array) {
		int front = 0;
		int reverse = 0;
		for (int i = 0; i < Array.length; i++) {
			front += Array[i][i];
			reverse += Array[Array.length - 1 - i][i];
		}
		System.out.println("正对角线上的数之和：" + front);
		System.out.println("反对角线上的数之和：" + reverse);
	}

}
