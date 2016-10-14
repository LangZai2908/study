package com.demo.day16;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午4:07:38
 */
public class SwitchCase {

	public static void main(String[] args) {
		switchEnum(WeekEnum.SUNDAY);
	}

	private static void switchEnum(WeekEnum week) {
		switch (week) {
		case MONDAY:
			System.out.println("星期一综合证，我要休息！！！");
			break;
		case THUESDAY:
			System.out.println("周末过得好过瘾啊");
			break;
		case WEDNESDAY:
			System.out.println("我要正式开始工作了，不要打扰我");
			break;
		case THURSDAY:
			System.out.println("还有一天就周末了，我要坚持");
			break;
		case FRIDAY:
			System.out.println("明天就周末了，加油");
			break;
		default:
			System.out.println("终于周末了，欧耶");
		}

	}

}
