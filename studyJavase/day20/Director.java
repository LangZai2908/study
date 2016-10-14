package com.chinasofti.javase.ch12;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月13日 下午3:57:23
 */
public class Director {
	public static void main(String[] args) {
		Instrument in = new Wind();

		in.play();
		// in.blow();// 编译器是父类的类型

		Wind wind = (Wind) in;
		wind.blow();

		Instrument in1 = new Stringed();
		in1.play();
		Wind wind1 = (Wind) in1;
		wind1.blow();

	}

}
