package com.demo.day6;

/**
 * ��ʾĳһ�죬�����Զ��ж�һЩ�������ڼ�����
 * 
 * @author ChenChangJian
 * @createTime 2016��9��20�� ����10:52:21
 */
public class Day {

	/**
	 * �ж��Ƿ�Ϊ��ĩ
	 * 
	 * @return
	 */
	public boolean isWeekend() {
		// 9.20
		return false;
	}

	/**
	 * �ж��Ƿ�Ϊ����
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
