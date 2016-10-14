package com.chinasofti.javase.ch9.accesscontrol.diff.sub;

import com.chinasofti.javase.ch9.accesscontrol.diff.Parent;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午5:36:09
 */
public class DiffPackageChild extends Parent {
	protected void protectedA() {

	}

	void defaultA() {

	}

	public void access() {
		// PrivateMethod();
		// defaultMethod();
		protectedMethod();
		protectedMethod();
	}
}
