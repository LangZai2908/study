package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����3:52:19
 */
public class MysStatic {
	public static void main(String[] args) {

		System.out.println(Computer.company);

		Computer.company = "Google";
		System.out.println(Computer.company);

		Computer.start();
		// Discourage ������ʹ��
		Computer c = new Computer();
		System.out.println(c.company);
		c.start();
		c.company = "LENOVO";

		for (int i = 0; i < 100; i++) {
			System.out.println(new Computer().company);
		}

		System.out.println(Computer.getCounter());
	}

}
