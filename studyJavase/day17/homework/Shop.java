package com.demo.day17.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午6:12:58
 */
public class Shop {
	private int shopCount;

	public void buyClothes(int clothesCount) {
		Scanner in = new Scanner(System.in);
		int clothes = 0;
		int shop = 0;
		int shopSellCount=0;
		loop: do {
			System.out.println("您现在进入的是第" + (shop + 1) + "家店");
			System.out.println("服务员问:先生您买衣服吗?");
			shopSellCount = 0;
			while (in.next().equals("yes")&&shopSellCount<3) {
				clothes++;
				System.out.println("购买一件衣服成功");
				System.out.println("服务员问:先生您还继续购买吗?");

				if (clothes == clothesCount) {
					shop++;
					break loop;
				}

			}
			shop++;

		} while (shop < shopCount);
		in.close();
		System.out.println("小王逛了" + shop + "家店了" + clothes + "件衣服");

	}

	public Shop(int shopCount) {
		this.shopCount = shopCount;
	}

	public static void main(String[] args) {
		Shop xiaoWang = new Shop(3);
		xiaoWang.buyClothes(5);

	}

}
