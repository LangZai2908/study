package com.demo.day18.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午6:32:29
 */
public class App {

	public static void main(String[] args) {
		Person person = new Person("王二", 120, true);
		Yuntai doorkeeper = new Yuntai();
		Dice dice = new Dice();
		if (!doorkeeper.qualify(person)) {
			System.out.println("对不起，您还没买票，你不能进入景区");
		}

		person.cost();
		System.out.println("我去玩两把兴许能凑够钱");
		for (int i = 0; i < 2; i++) {
			dice.playDice(person);
			System.out.println("我还剩" + person.getMoney() + "元");
		}

	}

}
