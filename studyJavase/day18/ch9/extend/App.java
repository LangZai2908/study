package com.chinasofti.javase.ch9.extend;

import java.util.Date;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����4:23:21
 */
public class App {
	public static void main(String[] args) {
		BankCard bankCard = new BankCard();
		bankCard.setCardNo("6600 8500 9110 1155 120");
		bankCard.setOwner("����");
		bankCard.setPassword("******");
		bankCard.setValidTime(new Date());
		// bankCard.setBalance(20000);

		DepositBankCard depositBankCard = new DepositBankCard();
		depositBankCard.setCardNo("6600 8500 9110 1155 120");
		depositBankCard.setOwner("����");
		depositBankCard.setPassword("******");
		depositBankCard.setValidTime(new Date());
		depositBankCard.setBalance(20000);
		System.out.println(depositBankCard.bank);
		depositBankCard.transfer("", "", 10000);

		CreditBankCard creditBankCard = new CreditBankCard();
		creditBankCard.setCardNo("6600 8500 9110 1155 120");
		creditBankCard.setOwner("����");
		creditBankCard.setPassword("******");
		creditBankCard.setValidTime(new Date());
		creditBankCard.setBalance(2000000);
		creditBankCard.transfer("", "", 10000);

	}
}
