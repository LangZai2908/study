package com.demo.coreJava;

/**
 * 方法重载，构造方法重载作业
 * 
 * @author ChenChangJian
 * @createTime 2016年9月18日 下午4:23:55
 */
public class App {

	/**
	 * 机器名
	 */
	private String name;
	/**
	 * 使用地点
	 */
	private String site;
	/**
	 * 生产厂家
	 */
	private String factory;
	/**
	 * 设备状态
	 */
	private String status = "使用";

	public void use(int count) {
		System.out.println("设备状态：" + status + "\t" + "已" + status + ":" + count + "个月");
	}

	public void use(int count, String status) {
		this.status = status;
		System.out.println("设备状态：" + status + "\t" + "已" + status + ":" + count + "个月");
	}

	public void use(String status, int count) {
		this.status = status;
		System.out.println("设备状态：" + status + "\t" + "已" + status + ":" + count + "个月");
	}

	public App(String name, String site, String factory) {
		this.name = name;
		this.site = site;
		this.factory = factory;
		System.out.println("设备名称：" + name + "\n使用地点：" + site + "\n生产厂家：" + factory);
	}

	public App(String name, String factory) {
		this(name, "地面", factory);
	}

	public App(String name) {
		this(name, "地面", "");
	}

	public static void main(String[] args) {
		App highSwitch = new App("矿用高压真空配电装置", "3#轨胶联巷临时配电点", "济源矿用");
		highSwitch.use(10);
		App beltConveyor = new App("带式输送机");
		beltConveyor.use(5, "维修");
		App lowSwitch = new App("矿用低压真空电磁起动器", "济源矿用");
		lowSwitch.use("报废", 36);

	}

}
