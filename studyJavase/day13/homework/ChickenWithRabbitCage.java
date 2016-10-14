package com.demo.day13.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月29日 下午5:17:44
 */
public class ChickenWithRabbitCage {

	public static void main(String[] args) {

		cwrc(100, 372);
	}

	private static void cwrc(int head, int leg) {

		int rabbit = 0;
		int chicken = 0;

		rabbit = (leg - 2 * head) / 2;
		chicken = head - rabbit;
		System.out.println("鸡有" + chicken + "只");
		System.out.println("兔子有" + rabbit + "只");

	}

}
