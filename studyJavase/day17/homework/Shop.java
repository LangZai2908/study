package com.demo.day17.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����6:12:58
 */
public class Shop {
	private int shopCount;

	public void buyClothes(int clothesCount) {
		Scanner in = new Scanner(System.in);
		int clothes = 0;
		int shop = 0;
		int shopSellCount=0;
		loop: do {
			System.out.println("�����ڽ�����ǵ�" + (shop + 1) + "�ҵ�");
			System.out.println("����Ա��:���������·���?");
			shopSellCount = 0;
			while (in.next().equals("yes")&&shopSellCount<3) {
				clothes++;
				System.out.println("����һ���·��ɹ�");
				System.out.println("����Ա��:������������������?");

				if (clothes == clothesCount) {
					shop++;
					break loop;
				}

			}
			shop++;

		} while (shop < shopCount);
		in.close();
		System.out.println("С������" + shop + "�ҵ���" + clothes + "���·�");

	}

	public Shop(int shopCount) {
		this.shopCount = shopCount;
	}

	public static void main(String[] args) {
		Shop xiaoWang = new Shop(3);
		xiaoWang.buyClothes(5);

	}

}
