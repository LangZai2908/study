package com.demo.day17.homework;

import java.math.BigDecimal;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����5:32:21
 */
public class Bank {
	/**
	 * ����
	 */
	private double corpus;
	/**
	 * ������
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
		System.out.println("�����ı���" + cq.deposit(5));
		System.out.println("ʮ���ı���" + cq.deposit(10));

	}

}
