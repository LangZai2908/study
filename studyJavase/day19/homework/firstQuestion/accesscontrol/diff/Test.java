package com.chinasofti.javase.ch9.accesscontrol.diff;

import com.chinasofti.javase.ch9.accesscontrol.diff.sub.DiffPackageChild;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午5:34:57
 */
public class Test {
	public static void main(String[] args) {
		SamePackageChild spc = new SamePackageChild();
		spc.defaultMethod();
		spc.protectedMethod();
		spc.publicMethod();

		DiffPackageChild dpc = new DiffPackageChild();
		// dpc.defaultMethod();
		dpc.protectedMethod();
		dpc.publicMethod();
	}
}
