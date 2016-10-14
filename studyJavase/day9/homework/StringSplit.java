package com.demo.day9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月23日 下午4:55:52
 */
public class StringSplit {

	public static void main(String[] args) {

		System.out.println("--------------字符串拆分第一种方法------------");

		char[] c = QiangJingJiu.qiangJingJiu.toCharArray();
		for (int i = 0; i < 19; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 19; i < 38; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 38; i < 54; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 54; i < 70; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 70; i < 86; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 86; i < 102; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		for (int i = 102; i < 116; i++) {
			System.out.print(c[i]);
		}
		System.out.println();

		System.out.println("--------------字符串拆分第二种方法------------");

		String stave0 = QiangJingJiu.qiangJingJiu.substring(0, 19);
		String stave1 = QiangJingJiu.qiangJingJiu.substring(19, 38);
		String stave2 = QiangJingJiu.qiangJingJiu.substring(38, 54);
		String stave3 = QiangJingJiu.qiangJingJiu.substring(54, 70);
		String stave4 = QiangJingJiu.qiangJingJiu.substring(70, 86);
		String stave5 = QiangJingJiu.qiangJingJiu.substring(86, 102);
		String stave6 = QiangJingJiu.qiangJingJiu.substring(102, 116);

		System.out.println(stave0);
		System.out.println(stave1);
		System.out.println(stave2);
		System.out.println(stave3);
		System.out.println(stave4);
		System.out.println(stave5);
		System.out.println(stave6);

		System.out.println("--------------字符串拆分第三种方法------------");

		String[] sta = QiangJingJiu.qiangJingJiu.split("。");
		for (int i = 0; i < sta.length; i++) {
			System.out.println(sta[i]);
		}

	}

}
