package com.demo.day6;
/**
* @author 陈昌建
*/
import java.util.Random;
import java.util.Scanner;

public class RocknRoll {
	private static String[] names = { "胡帅", "刘湘", "张郊", "罗信", "刘发及", "龙科宇", "陈昌建", "曹龄", "李奥", "胡小祥", "黄林玲", "顾渐旭",
			"李南轩", "张少阳", "刘敬东", "封延超", "但奎勇", "施龙飞", "廖兵", "杨森", "宋阳", "原剑", "林蜀杰", "黄鑫", "刘江来", "熊春颖", "李胜利", "倪思阳" };

	public int[] save = new int[28];

	public static void main(String[] args) {

		RocknRoll roll = new RocknRoll();
		Scanner contral = new Scanner(System.in);
		int i = 0;

		loop1: for (; i < 28; i++) {
			int randomInt = new Random().nextInt(28);
			randomInt++;
			for (int j = 0; j < 28; j++) {
				if (roll.save[j] == randomInt) {
					randomInt = new Random().nextInt(28);
					randomInt++;
					j = -1;
				} else if (j == i) {
					roll.save[i] = randomInt;
				}
			}
			String next = contral.nextLine();
			System.out.println((randomInt) + "号:" + names[--randomInt]);

		}

	}
}
