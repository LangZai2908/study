package com.chinasofti.javase.ch4.day6;

/**
 * 统计业绩
 * 
 * @author ChenChangJian
 * @createTime 2016年9月20日 下午5:05:50
 */
public class App {

	public static void main(String[] args) {
		Salesman salesman = new Salesman(75273, "张三");
		House house = new House("重庆石桥铺", 300);
		House house1 = new House("重庆石桥铺", 500);
		House house2 = new House("重庆九龙坡", 500);
		salesman.sell(house);
		salesman.sell(house1);
		salesman.sell(house2);
		System.out.println("工号为" + salesman.getWorkNo() + "\r的销售员" + salesman.getName() + "\r的本月业绩为"
				+ salesman.getSale() + "\r共租出" + House.rentCount + "间房屋" + "\r其中佣金为" + salesman.getBrokerage()
				+ "\r工资总额为" + salesman.getSalary());

	}

}
