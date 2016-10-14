package com.chinasofti.javase.ch9.accesscontrol;

import com.chinasofti.javase.ch9.accesscontrol.sub.Banana;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午5:17:15
 */
public class OBanana extends Fruit {
	public static void main(String[] args) {

		new OBanana().getDefault();
		new OBanana().getProtected();
		new OBanana().getColor();

		new Banana().getColor();

	}
}
