package com.chinasofti.javase.ch9.accesscontrol;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����11:39:41
 */
public class Fruit {

	private String color;

	private String size;

	private String taste;

	private String getPrivate() {
		return "ˮ��";
	}

	String getDefault() {
		return color + ":" + size + ":" + taste;
	}

	protected boolean getProtected() {
		return true;
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
