package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午6:08:42
 */
public class Round extends Point {

	/**
	 * 圆的半径
	 */
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Round() {
		super();

	}

	public void drawRound(double x, double y, double radius) {
		this.setX(x);
		this.setY(y);
		this.setRadius(radius);

		System.out.println("该圆是以(" + this.getX() + "," + this.getY() + ")为圆心，以" + this.getRadius() + "为半径的一个圆");

	}

}
