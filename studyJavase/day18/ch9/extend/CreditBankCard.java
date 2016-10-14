package com.chinasofti.javase.ch9.extend;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午4:51:06
 */
public class CreditBankCard extends BankCard {

	/**
	 * 信用额度
	 */
	private double balance;

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
