package com.chinasofti.javase.ch9.accesscontrol.diff;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午5:31:32
 */
public class SamePackageChild extends Parent {
	public void access() {
		// PrivateMethod();
		defaultMethod();
		protectedMethod();
		protectedMethod();
	}
}
