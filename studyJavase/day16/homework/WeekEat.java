package com.demo.day16.homework;

import com.demo.day16.WeekEnum;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��9�� ����5:24:35
 */
public class WeekEat {

	public static void main(String[] args) {
		eat(WeekEnum.MONDAY);

	}

	private static void eat(WeekEnum week) {

		switch (week) {
		case MONDAY:
			System.out.println("����һ��С��");
			break;
		case THUESDAY:
			System.out.println("���ڶ���С��");
			break;
		case WEDNESDAY:
			System.out.println("��������С��");
			break;
		case THURSDAY:
			System.out.println("�����ĳ�С��");
			break;
		case FRIDAY:
			System.out.println("�������С��");
			break;
		default:
			System.out.println("�Դ��");
		}

	}

}
