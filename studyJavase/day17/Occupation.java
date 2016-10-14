package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����11:42:47
 */
public class Occupation {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean recruit(Person person) {
		return person.getSalary() < 3000 && person.getAddress().equals("����");
	}

}
