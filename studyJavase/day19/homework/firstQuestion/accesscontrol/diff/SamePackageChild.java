package com.chinasofti.javase.ch9.accesscontrol.diff;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����5:31:32
 */
public class SamePackageChild extends Parent {
	public void access() {
		// PrivateMethod();
		defaultMethod();
		protectedMethod();
		protectedMethod();
	}
}
