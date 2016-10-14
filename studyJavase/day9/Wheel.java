package com.demo.day9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月23日 上午11:35:43
 */
public class Wheel {

	private String name;

	private Plane plane;

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public String getName() {
		return name;
	}

	public Wheel(String name) {
		this.name = name;

	}

}
