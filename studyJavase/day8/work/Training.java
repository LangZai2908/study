package com.demo.day8.ChangJian;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��22�� ����4:34:38
 */
public class Training {

	public double centigrade(double fahrenheit) {
		double centigrade = 5.0 / 9.0 * (fahrenheit - 32);
		return centigrade;
	}

	public static void main(String[] args) {

		System.out.println("---------------��һ��:����ʽ��ֵ---------------");
		int a = 2;
		int b = 3;
		float x = 3.5f;
		float y = 2.5f;
		// ����a+b��5���ٽ���ת����float����Ϊ5.0��float����int���Ϊfloat����Ϊ2.5
		// �Ƚ�x��yǿ��ת����int������ȡ���1�������ӵ�3.5
		float result = (float) (a + b) / 2 + (int) x % (int) y;
		System.out.println("���ʽ��ֵΪ��" + result);

		System.out.println("---------------�ڶ���:�������������ֵ---------------");
		Scanner in = new Scanner(System.in);
		System.out.print("��һ����Ϊ��");
		int a1 = in.nextInt();
		System.out.print("�ڶ�����Ϊ��");
		int b1 = in.nextInt();
		int max = a1 > b1 ? a1 : b1;
		System.out.println("�����������ֵΪ��" + max);

		System.out.println("---------------������:�ֱ����һ�����İ�λ��ʮλ����λ---------------");
		int a2 = in.nextInt();
		int hundred = a2 / 100;
		System.out.println("������İ�λ��" + hundred);
		int ten = (a2 - hundred * 100) / 10;
		System.out.println("�������ʮλ��" + ten);
		int unit = (a2 - hundred * 100) % 10;
		System.out.println("������ĸ�λ��" + unit);

		System.out.println("---------------������:�������¶�ת���������¶�---------------");
		Training temp = new Training();
		System.out.print("�����뻪���¶ȣ�");
		int a4 = in.nextInt();
		System.out.println("�����¶ȣ�" + temp.centigrade(a4));

		System.out.println("---------------������:������������֮����---------------");
		System.out.print("������a��");
		int a3 = in.nextInt();
		System.out.print("������b��");
		int b4 = in.nextInt();
		System.out.print("aΪ��" + a3);
		System.out.println("\t\tbΪ��" + b4);
		int storage;
		storage = a3;
		a3 = b4;
		b4 = storage;
		System.out.print("aΪ��" + a3);
		System.out.println("\tbΪ��" + b4);

	}

}
