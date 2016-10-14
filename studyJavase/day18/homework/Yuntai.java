package com.demo.day18.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午5:47:35
 */
public class Yuntai {

	public static final double PRICE = 210;

	public static int ticket = 200;

	public boolean qualify(Person person) {
		// 判断买全票还是学生票
		double finalPrice = Yuntai.PRICE;
		if (person.isStudent()) {
			finalPrice = 135;
		}

		if (person.getMoney() >= finalPrice && Yuntai.ticket != 0) {
			Yuntai.ticket--;
			return true;
		} else {
			return false;
		}
	}

}
