package com.chinasofti.javase.ch4.day6;

/**
 * 房屋类
 * 
 * @author ChenChangJian
 * @createTime 2016年9月20日 下午4:40:15
 */
public class House {

	/**
	 * 房屋位置
	 */
	private String site;

	/**
	 * 出租价格
	 */
	private double price;

	/**
	 * 是否租出
	 */
	private boolean sold;

	/**
	 * 租出的房屋数量
	 */
	public static int rentCount;

	public House(String site, double price) {
		this.site = site;
		this.price = price;
	}

	/**
	 * 表示房屋已租出
	 */
	public void setSold() {
		this.sold = true;
		rentCount++;
	}

	public double getPrice() {
		return price;
	}

}
