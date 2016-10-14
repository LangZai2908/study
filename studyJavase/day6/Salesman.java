package com.chinasofti.javase.ch4.day6;

/**
 * 销售员
 * 
 * @author ChenChangJian
 * @createTime 2016年9月20日 下午4:46:31
 */
public class Salesman {

	/**
	 * 工号
	 */
	private int workNo;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 销售额
	 */
	private double sale;

	/**
	 * 佣金
	 */
	private double brokerage;

	/**
	 * 工资
	 */
	private double salary;

	/**
	 * 计算销售额
	 */
	public void sell(House house) {
		house.setSold();
		sale += house.getPrice();
		this.setBrokerage(house);
	}

	public void setBrokerage(House house) {
		brokerage += house.getPrice() * 0.02;
	}

	public double getSale() {
		return sale;
	}

	public double getBrokerage() {
		return brokerage;
	}

	public Salesman(int workNo, String name) {
		this.workNo = workNo;
		this.name = name;
	}

	public int getWorkNo() {
		return workNo;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return this.getBrokerage() + 1000;
	}

}
