package com.demo.day9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月23日 上午11:32:23
 */
public class Plane {

	private Wheel wheel;

	private String name;

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public String getName() {
		return name;
	}

	public Plane(String name) {
		this.name = name;
	}

}
