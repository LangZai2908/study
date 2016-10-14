package com.demo.day7;

/**
 * 房屋中介
 * 
 * @author ChenChangJian
 * @createTime 2016年9月21日 上午11:42:31
 */
public class HouseAgent {

	/**
	 * 姓名
	 */
	public String name;

	/**
	 * 销售额
	 */
	public double saleAmount;

	/**
	 * 卖房子
	 * 
	 * @param house
	 */
	public void sell(House house) {
		// 计算新的销售额：原来的销售额加上房屋的价格
		this.saleAmount = saleAmount + house.price;

	}

}
