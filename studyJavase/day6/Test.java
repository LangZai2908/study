package com.demo.day6;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月20日 上午10:55:49
 */
public class Test {

	public boolean test2() {
		return 5 > 3;
	}

	public boolean test1(int x, int y) {
		return x > y;
	}

	public boolean test(Day today) {
		return today.isWeekend() && today.isSunny();
	}

	public static void main(String[] args) {
		Test test = new Test();
		Day yesterday = new Day();
		System.out.println(test.test(yesterday));
	}
}
