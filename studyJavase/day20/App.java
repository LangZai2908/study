package com.chinasofti.javase.ch10;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��13�� ����2:52:52
 */
public class App {

	public static void main(String[] args) {

		// �����಻��ʵ����
		// Shape a = new Shape();
		Circle c = new Circle();

		Shape s1 = new Circle();
		s1.area();
		Shape s2 = new Triangle();
		s2.area();
		Shape s3 = new Circle();
		s3.area();
	}

}
