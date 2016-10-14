package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午3:52:19
 */
public class MysStatic {
	public static void main(String[] args) {

		System.out.println(Computer.company);

		Computer.company = "Google";
		System.out.println(Computer.company);

		Computer.start();
		// Discourage 不鼓励使用
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
