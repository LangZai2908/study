package com.demo.day7;

/**
 * ����App
 * 
 * @author ChenChangJian
 * @createTime 2016��9��21�� ����11:47:30
 */
public class App {

	public static void main(String[] args) {
		// �ǼǷ���
		House goodHouse = new House();
		goodHouse.address = "��������";
		goodHouse.price = 1000.00;

		House normalHouse = new House();
		normalHouse.address = "ʯ����";
		normalHouse.price = 1000000;
		// �н����
		HouseAgent agent = new HouseAgent();
		agent.name = "����";
		// ����
		agent.sell(normalHouse);
		agent.sell(goodHouse);

		// ��ӡ���
		System.out.println(agent.name + "���ˣ�" + agent.saleAmount + "��");

		System.out.println("-------------------��֤����Ȩ�޿��Ʒ�------------------");

		Proving proving = new Proving();
		proving.pubProving();
		proving.defProving();
		// proving.priProving();

		System.out.println("-------------------����ģʽ------------------");
		Singleton a0 = Singleton.singleton();
		Singleton a1 = Singleton.singleton();
		Singleton a2 = Singleton.singleton();
		Singleton a3 = Singleton.singleton();
		Singleton a4 = Singleton.singleton();
		System.out.println("a0�����ַΪ" + a0);
		System.out.println("a1�����ַΪ" + a1);
		System.out.println("a2�����ַΪ" + a2);
		System.out.println("a3�����ַΪ" + a3);
		System.out.println("a4�����ַΪ" + a4);
	}

}
