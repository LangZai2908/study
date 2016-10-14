package com.demo.day12;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月28日 下午3:32:45
 */
public class Work {

	public static void main(String[] args) {

		int[] count0 = { 1, 3, 5, 4, 7, 89, 66, 123 };
		int[] count1 = { 2, 455, 78, 99, 100 };
		int[] count2 = { 5, 3, 7, 8, 9, 288, 2, 34 };

		System.out.println(sum(count0));
		System.out.println(average(count1));
		System.out.println(max(count2));
	}

	// 计算所有数的种
	private static int sum(int[] count) {

		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
		}
		return sum;
	}

	// 计算所有数的平均数
	private static double average(int[] count) {

		return (double) sum(count) / count.length;
	}

	// 计算所有数的最大值
	private static int max(int[] count) {
		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			max = max > count[i] ? max : count[i];
		}
		return max;
	}

}
