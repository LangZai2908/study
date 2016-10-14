package com.demo.day16.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午4:49:57
 */
public class Army {
	private int age;
	private String name;
	private double height;
	private String sex;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean joinArmy() {
		if (sex.equals("男")) {
			if (height <= 170) {
				return false;
			}
			if (age < 20 || age > 26) {
				return false;
			}

		} else if (sex.equals("女")) {
			if (height <= 162) {
				return false;
			}
			if (age < 20 || age > 22) {
				return false;
			}

		} else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Army person = new Army();
		System.out.println("请输入姓名：");
		person.setName(in.nextLine());
		System.out.println("请输入性别：");
		person.setSex(in.nextLine());
		System.out.println("请输入年龄：");
		person.setAge(in.nextInt());
		System.out.println("请输入身高(cm)：");
		person.setHeight(in.nextDouble());
		if (person.joinArmy()) {
			System.out.println("你能加入部队");
		} else {
			System.out.println("你不能加入部队");
		}
		in.close();
	}

}
