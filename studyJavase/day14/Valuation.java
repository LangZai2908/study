package com.demo.day14;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��30�� ����2:39:10
 */
public class Valuation {

	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public Valuation(String a) {
		super();
		this.a = a;
	}

	public static void main(String[] args) {

		Valuation value = new Valuation("ccj");
		System.out.println(value.getA());
		System.out.println(value);

		change(value);
		System.out.println(value.getA());
		System.out.println(value);

	}

	public static void change(Valuation value) {
		value = new Valuation("lp");
		System.out.println(value);

		value.setA("lp");
	}
}
