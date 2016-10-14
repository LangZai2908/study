package com.demo.day16.homework;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��9�� ����5:33:30
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
			return "��";
		} else if (mark >= 60 && mark <= 70) {
			return "��";
		} else {
			return "��";
		}
	}

	public IsMark(String name, double mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public static void main(String[] args) {
		IsMark person = new IsMark("С��", 85);
		IsMark person1 = new IsMark("С��", 68);
		IsMark person2 = new IsMark("С��", 58);
		print(person);
		print(person1);
		print(person2);

	}

	public static void print(IsMark person) {
		System.out.println(person.getName() + "�ĳɼ�Ϊ" + person.isMark());
	}

}
