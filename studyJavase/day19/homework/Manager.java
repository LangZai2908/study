package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午6:34:30
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
		System.out.println("职位： 经理");
		System.out.println("管理部门: " + this.leadDepartment);
	}
}
