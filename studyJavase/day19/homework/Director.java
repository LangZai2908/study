package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����6:35:22
 */
public class Director extends Employee {
	private double travelAllowance;

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(double travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public void show() {
		super.show();
		System.out.println("ְλ�� ����");
		System.out.println("��ͨ������ "+ this.travelAllowance);
	}

}
