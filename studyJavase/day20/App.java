package com.chinasofti.javase.ch10;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月13日 下午2:52:52
 */
public class App {

	public static void main(String[] args) {

		// 抽象类不能实例化
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
