package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 上午11:54:06
 */
public class App {

	public static void main(String[] args) {
		// testPerson();
		// testBreak();
		testBreakLabel();
		testContinue();

	}

	private static void testContinue() {
		for (int i = 0; i < 10; i++) {
			System.out.println("耍朋友日记：第" + (i + 1) + "天");
			System.out.println("看电影");
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("吃饭");
			System.out.println("唱歌");
			if (i == 5) {
				System.out.println("聊天");
			}
		}

	}

	private static void testBreakLabel() {
		outer: for (int i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				if (i + j == 15) {
					System.out.println("i=" + i + " j=" + j + "终止外部循环");
					break outer;
				}
				System.out.println("i=" + i + " j=" + j + "内部循环");
			}
			System.out.println("i=" + i + "外部循环");

		}

	}

	private static void testBreak() {
		int sum = 0;
		for (int i = 0; i < 6666; i++) {
			sum += i;
			if (sum >= 6666) {
				System.out.println("i= " + i + " sum= " + sum + "够了！");
			}
		}
	}

	private static void testPerson() {
		Person[] person = new Person[3];
		person[0] = new Person("小花", "重庆", 5000);
		person[1] = new Person("小绿", "河南", 2000);
		person[2] = new Person("小红", "重庆", 2000);
		Occupation occupation = new Occupation();
		occupation.setSalary(3000);
		// int i = 0;
		// while (i < person.length) {
		// if (person[i].recruit(occupation) && occupation.recruit(person[i])) {
		// System.out.println("恭喜" + person[i].getName() + "被录取 了");
		// }
		// i++;
		// }
		for (int i = 0; i < person.length; i++) {
			if (person[i].recruit(occupation) && occupation.recruit(person[i])) {
				System.out.println("恭喜" + person[i].getName() + "被录取 了");
			}
		}
		for (int i = 0;; i++) {
			System.out.println(i);
		}
	}

}
