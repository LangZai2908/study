package com.demo.day6;

/**
 * 表示某一天，可以自动判断一些特殊日期及天气
 * 
 * @author ChenChangJian
 * @createTime 2016年9月20日 上午10:52:21
 */
public class Day {

	/**
	 * 判断是否为周末
	 * 
	 * @return
	 */
	public boolean isWeekend() {
		// 9.20
		return false;
	}

	/**
	 * 判断是否为晴天
	 * 
	 * @return
	 */
	public boolean isSunny() {
		return false;
	}

	public int test(boolean onOff) {
		return onOff ? 1 : 0;
	}

	public static void main(String[] args) {
		Test test = new Test();
		Day today = new Day();
		test.test(today);
		int testTrue = today.test(true);
		System.out.println(testTrue);
		int testFlase = today.test(false);
		System.out.println(testFlase);
		int testDay = today.test(today.isSunny());
		System.out.println(testDay);

	}

}
