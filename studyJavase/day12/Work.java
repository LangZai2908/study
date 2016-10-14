package com.demo.day12;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��28�� ����3:32:45
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

	// ��������������
	private static int sum(int[] count) {

		int sum = 0;
		for (int i = 0; i < count.length; i++) {
			sum += count[i];
		}
		return sum;
	}

	// ������������ƽ����
	private static double average(int[] count) {

		return (double) sum(count) / count.length;
	}

	// ���������������ֵ
	private static int max(int[] count) {
		int max = count[0];
		for (int i = 0; i < count.length; i++) {
			max = max > count[i] ? max : count[i];
		}
		return max;
	}

}
