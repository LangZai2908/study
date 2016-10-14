package com.chinasofti.javase.ch9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午2:45:11
 */
public class SmartCar {
	/**
	 * 轮子
	 */
	private Wheel[] wheels = { new Wheel("左前"), new Wheel("右前"), new Wheel("左后"), new Wheel("右后") };
	/**
	 * 引擎
	 */
	private Engine engine = new Engine();// 类与类的关联关系

	/**
	 * 速度
	 */
	private int speed;

	public void drive(Instruction instruction) {// 类与类的依赖关系
		switch (instruction.getContent()) {
		case "speed-up":
			// engine.setSpeed(instruction.getParam());
			if (instruction.getParam() > 100) {
				speed = 100;
			} else {
				speed = instruction.getParam();
			}
			break;
		case "slow-down":
			engine.setSpeed(instruction.getParam());
			break;
		default:
			// do nothing
		}
		System.out.println("智能汽车正在以" + engine.getSpeed() + "的速度行驶");

	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
