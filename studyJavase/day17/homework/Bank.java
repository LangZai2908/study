package com.demo.day17.homework;

import java.math.BigDecimal;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 下午5:32:21
 */
public class Bank {
	/**
	 * 本金
	 */
	private double corpus;
	/**
	 * 年利率
	 */
	private double annualRate;

	public double deposit(int year) {
		BigDecimal temp = new BigDecimal(corpus);
		for (int i = 0; i < year; i++) {
			temp = temp.multiply(new BigDecimal(1 + annualRate)).divide(new BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP);
			// temp = temp + new BigDecimal(temp * annualRate).divide(new
			// BigDecimal(1), 2, BigDecimal.ROUND_HALF_UP)
			// .doubleValue();
		}
		return temp.doubleValue();

	}

	public Bank(double corpus, double annualRate) {
		this.corpus = corpus;
		this.annualRate = annualRate;
	}

	public static void main(String[] args) {
		Bank cq = new Bank(10000, 0.003);
		System.out.println("五年后的本金：" + cq.deposit(5));
		System.out.println("十年后的本金：" + cq.deposit(10));

	}

}
