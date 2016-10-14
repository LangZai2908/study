package com.demo.day7;

/**
 * 单例模式
 * 
 * @author ChenChangJian
 * @createTime 2016年9月21日 下午5:47:53
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
