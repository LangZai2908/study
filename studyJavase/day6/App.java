package com.chinasofti.javase.ch4.day6;

/**
 * ͳ��ҵ��
 * 
 * @author ChenChangJian
 * @createTime 2016��9��20�� ����5:05:50
 */
public class App {

	public static void main(String[] args) {
		Salesman salesman = new Salesman(75273, "����");
		House house = new House("����ʯ����", 300);
		House house1 = new House("����ʯ����", 500);
		House house2 = new House("���������", 500);
		salesman.sell(house);
		salesman.sell(house1);
		salesman.sell(house2);
		System.out.println("����Ϊ" + salesman.getWorkNo() + "\r������Ա" + salesman.getName() + "\r�ı���ҵ��Ϊ"
				+ salesman.getSale() + "\r�����" + House.rentCount + "�䷿��" + "\r����Ӷ��Ϊ" + salesman.getBrokerage()
				+ "\r�����ܶ�Ϊ" + salesman.getSalary());

	}

}
