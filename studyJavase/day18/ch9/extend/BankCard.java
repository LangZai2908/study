package com.chinasofti.javase.ch9.extend;

import java.util.Date;

/**
 * 银行卡
 * 
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午4:18:00
 */
public class BankCard {

	public String bank = "ICBC";

	/**
	 * 卡号
	 */
	private String cardNo;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 有效期
	 */
	private Date validTime;

	/**
	 * 持卡人
	 */
	private String owner;

	public boolean transfer(String source, String dest, double amount) {
		return true;
	}

	public boolean verify(String password) {
		////
		return true;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getValidTime() {
		return validTime;
	}

	public void setValidTime(Date validTime) {
		this.validTime = validTime;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
