package com.demo.day9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��23�� ����11:36:58
 */
public class Test {

	public static void main(String[] args) {

		Plane plane = new Plane("����747");
		Wheel wheel = new Wheel("JUMBO");
		plane.setWheel(wheel);
		wheel.setPlane(plane);
		System.out.println(plane.getWheel().getName());
		System.out.println(wheel.getPlane().getName());

	}

}
