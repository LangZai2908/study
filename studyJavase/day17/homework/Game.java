package com.demo.day17.homework;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����5:11:17
 */
public class Game {
	public void guessNumGame() {
		System.out.println("��ӭ��ʼ���˲²²�");
		int Num = new Random().nextInt(100);
		Scanner in = new Scanner(System.in);
		int i = 0;
		for (; i < 21; i++) {
			System.out.print("������²������");
			int GuessNum = in.nextInt();
			if (GuessNum > Num) {
				System.out.println("�ǳ��ź����²�����ֹ���");
			} else if (GuessNum < Num) {
				System.out.println("�ǳ��ź����²�����ֹ�С");

			} else {
				System.out.println("��ϲ��¶���");
				break;
			}

		}
		in.close();
		if (i >= 21) {
			System.out.println("��ϲ��ɹ�֤��������ǻ��д���ǿ");
		} else {
			System.out.println("��ϲ�㾭��" + (i + 1) + "�κ�ɹ���");
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.guessNumGame();
	}

}
