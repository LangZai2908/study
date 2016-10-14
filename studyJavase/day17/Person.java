package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月10日 上午11:47:32
 */
public class Person {
	private double salary;
	private String address;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, String address, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public boolean recruit(Occupation occupation) {
		return occupation.getSalary() >= 2000;
	}

}
