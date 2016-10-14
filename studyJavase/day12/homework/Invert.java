package com.demo.day12.homework;

import java.util.Arrays;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月28日 下午4:22:43
 */
public class Invert {

	public static void main(String[] args) {

		int[] a = { 5, 11, 15, 24, 36, 47, 59, 66 };
		System.out.println(Arrays.toString(Invert0(a)));

	}

	public static int[] Invert0(int[] count) {
		int[] tempArray = new int[count.length];
		for (int i = 0; i < count.length; i++) {
			tempArray[i] = count[count.length - 1 - i];
		}
		return tempArray;
	}

	public static int[] Invert1(int[] count) {
		int temp;
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; i < count.length - 1; i++) {
				temp = count[j];
				count[j] = count[j + 1];
				count[j + 1] = temp;
			}
		}

		return count;
	}

}
