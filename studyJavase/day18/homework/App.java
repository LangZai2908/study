package com.demo.day18.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����6:32:29
 */
public class App {

	public static void main(String[] args) {
		Person person = new Person("����", 120, true);
		Yuntai doorkeeper = new Yuntai();
		Dice dice = new Dice();
		if (!doorkeeper.qualify(person)) {
			System.out.println("�Բ�������û��Ʊ���㲻�ܽ��뾰��");
		}

		person.cost();
		System.out.println("��ȥ�����������ܴչ�Ǯ");
		for (int i = 0; i < 2; i++) {
			dice.playDice(person);
			System.out.println("�һ�ʣ" + person.getMoney() + "Ԫ");
		}

	}

}
