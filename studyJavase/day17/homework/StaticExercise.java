package com.demo.day17.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午6:58:14
 */
public class StaticExercise {

	public void eattingFood() {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();

		if (str.equals("你太胖了")) {
			clearEatCount();
		}
		System.out.println("今天的吃的" + str);
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

		System.out.println("一共吃了" + StaticExercise.eatCount + "顿");

	}

	public static int eatCount;

	static {
		System.out.println("---注意要开始统计了哦---");
	}

	public static void clearEatCount() {
		eatCount = 0;
	}

}
