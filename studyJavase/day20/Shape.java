package com.chinasofti.javase.ch10;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月13日 下午2:24:39
 */
public abstract class Shape {

	private String area;

	private double circumference;

	public abstract String getName();

	public abstract void area();

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

}
