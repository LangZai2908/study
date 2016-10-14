package com.demo.day7;

/**
 * 验证访问权限修饰符
 * 
 * @author ChenChangJian
 * @createTime 2016年9月21日 下午5:32:23
 */
public class Proving {

	public void pubProving() {
		System.out.println("public权限");
	}

	void defProving() {
		System.out.println("default权限");
	}

	private void priProving() {
		System.out.println("private权限");
	}

}
