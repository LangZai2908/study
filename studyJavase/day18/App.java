package com.demo.day18;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 上午11:42:50
 */
public class App {

	public static void main(String[] args) {

		MyFinal myFinal = new MyFinal();
		Company cpny = new Company("Apple");
		myFinal.testFinalParam(5, cpny);

	}

}
