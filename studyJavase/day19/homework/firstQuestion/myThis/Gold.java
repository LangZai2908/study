package com.chinasofti.javase.ch9.extend.myThis;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����5:51:40
 */
public class Gold {

	private String name = "���ʽ��ϼ�ͥ";

	/**
	 * �޲ι��췽��
	 */
	private Gold() {
		this("x");
		System.out.println(this.name);
		System.out.println(this);
	}

	/**
	 * �вι��췽��
	 *
	 */
	public Gold(String name) {
		this.name = name;
	}

	public void threat() {
		System.out.println("��в");
		this.fire();
	}

	public Gold getSelf() {
		return this;
	}

	private void fire() {
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Gold a = new Gold();
		Gold b = a.getSelf();
	}

}
