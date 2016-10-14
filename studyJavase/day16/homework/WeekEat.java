package com.demo.day16.homework;

import com.demo.day16.WeekEnum;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午5:24:35
 */
public class WeekEat {

	public static void main(String[] args) {
		eat(WeekEnum.MONDAY);

	}

	private static void eat(WeekEnum week) {

		switch (week) {
		case MONDAY:
			System.out.println("星期一吃小面");
			break;
		case THUESDAY:
			System.out.println("星期二吃小面");
			break;
		case WEDNESDAY:
			System.out.println("星期三吃小面");
			break;
		case THURSDAY:
			System.out.println("星期四吃小面");
			break;
		case FRIDAY:
			System.out.println("星期五吃小面");
			break;
		default:
			System.out.println("吃大餐");
		}

	}

}
