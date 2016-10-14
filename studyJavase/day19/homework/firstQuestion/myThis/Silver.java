package com.chinasofti.javase.ch9.extend.myThis;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����5:58:27
 */
public class Silver extends Precious {

	public String place = "xxxx";

	public Silver() {
		super();
		System.out.println("this :" + this.place);
		System.out.println("super :" + super.place);
		super.await();
		this.await();
	}

	public Silver(String place) {
		super();
		this.place = place;
	}

	public void await() {
		super.await();
		System.out.println("�����ڵȴ�");
	}

	public static void main(String[] main) {
		new Silver();
	}

}
