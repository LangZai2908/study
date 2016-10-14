package com.demo.day7;

/**
 * 测试App
 * 
 * @author ChenChangJian
 * @createTime 2016年9月21日 上午11:47:30
 */
public class App {

	public static void main(String[] args) {
		// 登记房屋
		House goodHouse = new House();
		goodHouse.address = "北京二环";
		goodHouse.price = 1000.00;

		House normalHouse = new House();
		normalHouse.address = "石桥铺";
		normalHouse.price = 1000000;
		// 中介出现
		HouseAgent agent = new HouseAgent();
		agent.name = "王二";
		// 卖房
		agent.sell(normalHouse);
		agent.sell(goodHouse);

		// 打印结果
		System.out.println(agent.name + "卖了￥" + agent.saleAmount + "万");

		System.out.println("-------------------验证访问权限控制符------------------");

		Proving proving = new Proving();
		proving.pubProving();
		proving.defProving();
		// proving.priProving();

		System.out.println("-------------------单例模式------------------");
		Singleton a0 = Singleton.singleton();
		Singleton a1 = Singleton.singleton();
		Singleton a2 = Singleton.singleton();
		Singleton a3 = Singleton.singleton();
		Singleton a4 = Singleton.singleton();
		System.out.println("a0的虚地址为" + a0);
		System.out.println("a1的虚地址为" + a1);
		System.out.println("a2的虚地址为" + a2);
		System.out.println("a3的虚地址为" + a3);
		System.out.println("a4的虚地址为" + a4);
	}

}
