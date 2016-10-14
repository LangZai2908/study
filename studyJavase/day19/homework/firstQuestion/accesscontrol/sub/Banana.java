package com.chinasofti.javase.ch9.accesscontrol.sub;

import com.chinasofti.javase.ch9.accesscontrol.Fruit;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����5:22:37
 */
public class Banana extends Fruit {
	public void eat() {
		getProtected();
	}

	public static void main(String[] args) {
		// new Banana().getPrivate();
		// new Banana().getDefault();
		new Banana().getProtected();
		new Banana().getColor();
	}

}
