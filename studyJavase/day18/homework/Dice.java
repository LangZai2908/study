package com.demo.day18.homework;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����6:49:24
 */
public class Dice extends Game {

	private Scanner in = new Scanner(System.in);// ���⣺�������д��playDice������ʱ���ڶ���ִ�иó���ʱ�ᱨ�쳣

	public void playDice(Person person) {
		if (person.getMoney() <= 0) {
			System.out.println("���������");
			return;
		}
		int targetNumber = (new Random().nextInt(6) + 1);
		// Scanner in = new Scanner(System.in);//��λ��
		System.out.println("�͹�ѹ���㣺");
		int guessNumber = in.nextInt();
		System.out.println(guessNumber + "�������֣��͹�ѹ���٣�");
		this.setWager(in.nextDouble());
		while (this.getWager() > person.getMoney()) {
			System.out.println("���룺ѹ̫���ˣ�����ѹ");
			this.setWager(in.nextDouble());
		}
		person.setMoney(person.getMoney() - this.getWager());
		System.out.println(this.getWager() + "Ԫ�����֣��͹�ѹ������");
		this.setMultiple(in.nextDouble());
		// in.close();
		if (guessNumber == targetNumber) {
			System.out.println("��ϲ�͹�ѹ����\r" + "�͹�ѹ��" + guessNumber + "��" + this.getWager() + "Ԫ" + this.getMultiple()
					+ "�����ƣ�" + finalWager());
			person.setMoney(person.getMoney() + this.finalWager());

		} else {
			System.out.println("��" + targetNumber + "��û�п͹��´�����");
			person.setMoney(person.getMoney() - finalWager() + this.getWager());
		}

	}

	private double finalWager() {
		return new BigDecimal(this.getWager()).multiply(new BigDecimal(this.getMultiple()))
				.divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
