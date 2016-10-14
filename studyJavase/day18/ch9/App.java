package com.chinasofti.javase.ch9;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月11日 下午3:13:15
 */
public class App {
	public static void main(String[] args) {
		SmartCar car = new SmartCar();
		Instruction instruction = new Instruction();
		instruction.setContent("speed-up");
		instruction.setParam(120);
		car.drive(instruction);
	}

}
