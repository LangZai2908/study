package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����6:26:31
 */
public class Employee {
	private String name;
	private String address;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void show() {
		System.out.println("������" + this.getName());
		System.out.println("��ַ��" + this.getAddress());
		System.out.println("�������ʣ�" + this.getSalary());
	}
}
