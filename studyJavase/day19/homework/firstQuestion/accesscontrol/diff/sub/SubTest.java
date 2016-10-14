package com.chinasofti.javase.ch9.accesscontrol.diff.sub;

import com.chinasofti.javase.ch9.accesscontrol.diff.SamePackageChild;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午5:45:34
 */
public class SubTest {
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
