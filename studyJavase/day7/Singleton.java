package com.demo.day7;

/**
 * ����ģʽ
 * 
 * @author ChenChangJian
 * @createTime 2016��9��21�� ����5:47:53
 */
public class Singleton {

	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton singleton() {
		if (singleton != null) {
			return singleton;
		} else {
			singleton = new Singleton();
			return singleton;
		}
	}

}
