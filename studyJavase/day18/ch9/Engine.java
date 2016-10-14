package com.chinasofti.javase.ch9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午2:45:24
 */
public class Engine {
	/**
	 * 气缸
	 */
	private Cylinder[] cylinder = new Cylinder[8];
	/**
	 * 转速
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
