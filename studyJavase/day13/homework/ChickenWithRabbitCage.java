package com.demo.day13.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��29�� ����5:17:44
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
		System.out.println("����" + chicken + "ֻ");
		System.out.println("������" + rabbit + "ֻ");

	}

}
