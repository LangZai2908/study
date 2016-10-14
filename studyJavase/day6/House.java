package com.chinasofti.javase.ch4.day6;

/**
 * ������
 * 
 * @author ChenChangJian
 * @createTime 2016��9��20�� ����4:40:15
 */
public class House {

	/**
	 * ����λ��
	 */
	private String site;

	/**
	 * ����۸�
	 */
	private double price;

	/**
	 * �Ƿ����
	 */
	private boolean sold;

	/**
	 * ����ķ�������
	 */
	public static int rentCount;

	public House(String site, double price) {
		this.site = site;
		this.price = price;
	}

	/**
	 * ��ʾ���������
	 */
	public void setSold() {
		this.sold = true;
		rentCount++;
	}

	public double getPrice() {
		return price;
	}

}
