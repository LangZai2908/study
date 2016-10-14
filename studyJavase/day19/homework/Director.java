package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午6:35:22
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
		System.out.println("职位： 董事");
		System.out.println("交通补助： "+ this.travelAllowance);
	}

}
