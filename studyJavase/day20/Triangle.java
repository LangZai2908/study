package com.chinasofti.javase.ch10;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月13日 下午2:49:15
 */
public class Triangle extends Shape {

	public void area() {
		System.out.println("三角形计算面积中");
	}

	@Override
	public String getName() {
		return "三角形";
	}
}
