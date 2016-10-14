package com.chinasofti.javase.ch4.day6;

/**
 * ����Ա
 * 
 * @author ChenChangJian
 * @createTime 2016��9��20�� ����4:46:31
 */
public class Salesman {

	/**
	 * ����
	 */
	private int workNo;

	/**
	 * ����
	 */
	private String name;

	/**
	 * ���۶�
	 */
	private double sale;

	/**
	 * Ӷ��
	 */
	private double brokerage;

	/**
	 * ����
	 */
	private double salary;

	/**
	 * �������۶�
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
