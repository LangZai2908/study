package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����6:34:30
 */
public class Manager extends Employee {
	private String leadDepartment;

	public String getLeadDepartment() {
		return leadDepartment;
	}

	public void setLeadDepartment(String leadDepartment) {
		this.leadDepartment = leadDepartment;
	}

	public void show() {
		super.show();
		System.out.println("ְλ�� ����");
		System.out.println("������: " + this.leadDepartment);
	}
}
