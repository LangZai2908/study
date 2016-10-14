package com.demo.day18;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 上午11:17:10
 */
public class MyFinal {

	private String name;

	private final String BRAND_NAME;

	private static final String BRAND = "ICS%S";

	private final int NUMBER = 5;

	// 引用类型的final属性，指的是引用和对象的关系是不可变的，也就是引用 不可指向其他对象
	private final Company COMPANY = new Company("ICS%S");

	/**
	 * 
	 */
	public MyFinal() {
		// final 属性必须在使用之前，即属性定义或者构造方法中完成初始化。
		// The blank final field BRAND_NAME may not have been initialized
		BRAND_NAME = "ICS%S";
	}

	public void testFinal() {
		// final的属性无法被修改
		// The final field MyFinal.BRAND_NAME cannot be assigned
		// BRAND_NAME="ICS%S";
		// COMPANY = new Company("microsoft");

		// final的引用类型的属性是可修改的。
		COMPANY.setName("microsoft");

	}

	public void testFinalParam(final int x, final Company cpny) {
		System.out.println("x: " + x);
		System.out.println("cpny: " + cpny);
		System.out.println(cpny.getName());
		cpny.setName("xxxx");
		System.out.println(cpny.getName());

		// The final local variable x cannot be assigned
		// It must be blank and not using a compound assignment
		// x=6;编译错误

	}

}
