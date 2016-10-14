package com.chinasofti.javase.ch9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����2:45:11
 */
public class SmartCar {
	/**
	 * ����
	 */
	private Wheel[] wheels = { new Wheel("��ǰ"), new Wheel("��ǰ"), new Wheel("���"), new Wheel("�Һ�") };
	/**
	 * ����
	 */
	private Engine engine = new Engine();// ������Ĺ�����ϵ

	/**
	 * �ٶ�
	 */
	private int speed;

	public void drive(Instruction instruction) {// �������������ϵ
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
		System.out.println("��������������" + engine.getSpeed() + "���ٶ���ʻ");

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
