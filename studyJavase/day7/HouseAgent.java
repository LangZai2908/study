package com.demo.day7;

/**
 * �����н�
 * 
 * @author ChenChangJian
 * @createTime 2016��9��21�� ����11:42:31
 */
public class HouseAgent {

	/**
	 * ����
	 */
	public String name;

	/**
	 * ���۶�
	 */
	public double saleAmount;

	/**
	 * ������
	 * 
	 * @param house
	 */
	public void sell(House house) {
		// �����µ����۶ԭ�������۶���Ϸ��ݵļ۸�
		this.saleAmount = saleAmount + house.price;

	}

}
