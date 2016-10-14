package com.demo.day5;

/**
 * 测试静态块、实例块、构造方法的顺序
 * 
 * @author ChenChangJian
 * @createTime 2016年9月19日 下午4:56:28
 */
public class Game {

	static {
		System.out.println("天涯明月刀登录中~~~~~~~~~~");
	}

	static {
		System.out.println("天涯明月刀重启中~~~~~~~~~~");
	}

	{
		System.out.println("天涯明月刀人物角色选择中~~~~~~~~~~~~~~~");
	}

	{
		System.out.println("天涯明月刀人物角色创建中~~~~~~~~~~~~~~~");
	}

	public Game() {
		System.out.println("天涯明月刀场景载入中~~~~~~~~~~~~~~");
	}

	public static void main(String[] args) {
		Game game = new Game();

	}

}
