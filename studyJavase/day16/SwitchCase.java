package com.demo.day16;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��9�� ����4:07:38
 */
public class SwitchCase {

	public static void main(String[] args) {
		switchEnum(WeekEnum.SUNDAY);
	}

	private static void switchEnum(WeekEnum week) {
		switch (week) {
		case MONDAY:
			System.out.println("����һ�ۺ�֤����Ҫ��Ϣ������");
			break;
		case THUESDAY:
			System.out.println("��ĩ���úù�񫰡");
			break;
		case WEDNESDAY:
			System.out.println("��Ҫ��ʽ��ʼ�����ˣ���Ҫ������");
			break;
		case THURSDAY:
			System.out.println("����һ�����ĩ�ˣ���Ҫ���");
			break;
		case FRIDAY:
			System.out.println("�������ĩ�ˣ�����");
			break;
		default:
			System.out.println("������ĩ�ˣ�ŷҮ");
		}

	}

}
