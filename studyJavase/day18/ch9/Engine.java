package com.chinasofti.javase.ch9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����2:45:24
 */
public class Engine {
	/**
	 * ����
	 */
	private Cylinder[] cylinder = new Cylinder[8];
	/**
	 * ת��
	 */
	private int speed;

	public Cylinder[] getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder[] cylinder) {
		this.cylinder = cylinder;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
