package com.demo.day15;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��8�� ����10:08:10
 */
public class Pass {
	/**
	 * �������͵�ֵ����
	 * 
	 * ���ݵ���ֵ�ÿ������������ڸı���ֵ��Ӱ����÷�����ֵ
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
	 * �������͵�ֵ����
	 * 
	 * ���ݵ������õĿ������������ڸı���ֵ��Ӱ����÷�����ֵ
	 * 
	 * @param g
	 */
	private static void changeRefType(Goods g) {
		System.out.println("changeRefType before:" + g);
		g = new Goods();
		System.out.println("changeRefType after:" + g);
	}

	/**
	 * ��ʽ�����Ǵ����ʵ�ʲ�����һ�ݿ��������ͬһ�����ַ��ָ��ͬһ������
	 *
	 * ��ָ�����Ĳ�����Ӱ�쵽ʵ�ʲ���ָ��Ķ���
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
