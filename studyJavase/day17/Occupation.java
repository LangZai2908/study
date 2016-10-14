package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 上午11:42:47
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
		return person.getSalary() < 3000 && person.getAddress().equals("重庆");
	}

}
