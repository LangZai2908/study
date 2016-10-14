package com.demo.day15;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月8日 上午10:08:10
 */
public class Pass {
	/**
	 * 基本类型的值传递
	 * 
	 * 传递的是值得拷贝，方法体内改变其值不影响调用方法的值
	 * 
	 * @param x
	 * @return
	 */

	private static int changePrimitive(int x) {
		System.out.println("changePrimitive before:" + x);
		x = 6;
		System.out.println("changePrimitive after:" + x);
		return x;
	}

	/**
	 * 引用类型的值传递
	 * 
	 * 传递的是引用的拷贝，方法体内改变其值不影响调用方法的值
	 * 
	 * @param g
	 */
	private static void changeRefType(Goods g) {
		System.out.println("changeRefType before:" + g);
		g = new Goods();
		System.out.println("changeRefType after:" + g);
	}

	/**
	 * 形式参数是传入的实际参数的一份拷贝，存的同一个虚地址，指向同一个对象
	 *
	 * 对指向对象的操作会影响到实际参数指向的对象
	 * 
	 * @param g
	 */
	private static void changeRefTypeField(Goods g) {
		g.setX(1990);
	}

	private static void changeNewRefTypeField(Goods g) {
		g = new Goods();
		g.setX(1990);

	}

	public static void main(String[] args) {
		//
		// int x = 5;
		// x = changePrimitive(x);
		// System.out.println("x:" + x);
		//
		Goods g = new Goods();
		// changeRefType(g);
		// System.out.println("g:" + g);
		//
		// g.setX(2016);
		// changeRefTypeField(g);
		// System.out.println(g.getX());

		g.setX(2016);
		changeNewRefTypeField(g);
		System.out.println(g.getX());

	}

}
