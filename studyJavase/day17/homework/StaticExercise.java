package com.demo.day17.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����6:58:14
 */
public class StaticExercise {

	public void eattingFood() {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();

		if (str.equals("��̫����")) {
			clearEatCount();
		}
		System.out.println("����ĳԵ�" + str);
	}

	public StaticExercise() {
		eatCount++;
	}

	public static void main(String[] args) {
		StaticExercise apple = new StaticExercise();
		StaticExercise noodle = new StaticExercise();
		StaticExercise banana = new StaticExercise();
		StaticExercise orange = new StaticExercise();
		StaticExercise water = new StaticExercise();

		System.out.println("һ������" + StaticExercise.eatCount + "��");

	}

	public static int eatCount;

	static {
		System.out.println("---ע��Ҫ��ʼͳ����Ŷ---");
	}

	public static void clearEatCount() {
		eatCount = 0;
	}

}
