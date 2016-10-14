package com.chinasofti.javase.ch9.extend.myThis;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午5:51:40
 */
public class Gold {

	private String name = "朝鲜金氏家庭";

	/**
	 * 无参构造方法
	 */
	private Gold() {
		this("x");
		System.out.println(this.name);
		System.out.println(this);
	}

	/**
	 * 有参构造方法
	 *
	 */
	public Gold(String name) {
		this.name = name;
	}

	public void threat() {
		System.out.println("威胁");
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
