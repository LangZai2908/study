package com.demo.day18.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����5:35:01
 */
public class Person {

	/**
	 * ����
	 */
	private String name;

	/**
	 * �ܹ�ӵ�е�Ǯ
	 */
	private double money;

	private Yuntai yuntai = new Yuntai();

	private boolean student;

	public boolean isStudent() {
		return student;
	}

	public String getName() {
		return name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void cost() {
		if (yuntai.qualify(this)) {
			System.out.println("����ô���ľ����ˣ�ȥ��̨ɽ�档");
		} else {
			System.out.println("��̨ɽ̫�󣬱��ˌ�˿һ�������������Ὺ�ڰɡ�");
		}
	}

	public Person(String name, double money, boolean student) {
		this.name = name;
		this.money = money;
		this.student = student;
	}

}
