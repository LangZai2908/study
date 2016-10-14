package com.chinasofti.javase.ch10;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月13日 下午2:51:55
 */
public class Circle extends Shape {

	@Override
	public String getName() {
		return "圆形";
	}

	@Override
	public void area() {
		System.out.println("圆形计算面积中..");

	}

}
