package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����6:08:42
 */
public class Round extends Point {

	/**
	 * Բ�İ뾶
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

		System.out.println("��Բ����(" + this.getX() + "," + this.getY() + ")ΪԲ�ģ���" + this.getRadius() + "Ϊ�뾶��һ��Բ");

	}

}
