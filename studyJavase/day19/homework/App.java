package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��12�� ����6:10:28
 */
public class App {
	public static void main(String[] args) {
		Round round = new Round();
		round.drawRound(0, 0, 25);

		Director director = new Director();
		director.setName("ɵ��");
		director.setAddress("�Ҹ����������󴰲�������");
		director.setSalary(20000000);
		director.setTravelAllowance(20000);
		director.show();

		Manager manager = new Manager();
		manager.setName("����");
		manager.setAddress("�Ҹ����������󴰲�������");
		manager.setSalary(20000);
		manager.setLeadDepartment("���ϲ�����ȱ��");
		manager.show();

	}
}
