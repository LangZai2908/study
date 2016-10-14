package com.demo.day17.homework;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午5:11:17
 */
public class Game {
	public void guessNumGame() {
		System.out.println("欢迎开始幸运猜猜猜");
		int Num = new Random().nextInt(100);
		Scanner in = new Scanner(System.in);
		int i = 0;
		for (; i < 21; i++) {
			System.out.print("请输入猜测的数字");
			int GuessNum = in.nextInt();
			if (GuessNum > Num) {
				System.out.println("非常遗憾您猜测的数字过大");
			} else if (GuessNum < Num) {
				System.out.println("非常遗憾您猜测的数字过小");

			} else {
				System.out.println("恭喜你猜对了");
				break;
			}

		}
		in.close();
		if (i >= 21) {
			System.out.println("恭喜你成功证明了你的智慧有待加强");
		} else {
			System.out.println("恭喜你经过" + (i + 1) + "次后成功了");
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.guessNumGame();
	}

}
