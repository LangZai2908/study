package com.demo.day16.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午5:33:30
 */
public class IsMark {

	private String name;
	private double mark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public String isMark() {
		if (mark < 60) {
			return "差";
		} else if (mark >= 60 && mark <= 70) {
			return "中";
		} else {
			return "优";
		}
	}

	public IsMark(String name, double mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public static void main(String[] args) {
		IsMark person = new IsMark("小明", 85);
		IsMark person1 = new IsMark("小花", 68);
		IsMark person2 = new IsMark("小丽", 58);
		print(person);
		print(person1);
		print(person2);

	}

	public static void print(IsMark person) {
		System.out.println(person.getName() + "的成绩为" + person.isMark());
	}

}
