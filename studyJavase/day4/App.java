package com.demo.coreJava;

/**
 * �������أ����췽��������ҵ
 * 
 * @author ChenChangJian
 * @createTime 2016��9��18�� ����4:23:55
 */
public class App {

	/**
	 * ������
	 */
	private String name;
	/**
	 * ʹ�õص�
	 */
	private String site;
	/**
	 * ��������
	 */
	private String factory;
	/**
	 * �豸״̬
	 */
	private String status = "ʹ��";

	public void use(int count) {
		System.out.println("�豸״̬��" + status + "\t" + "��" + status + ":" + count + "����");
	}

	public void use(int count, String status) {
		this.status = status;
		System.out.println("�豸״̬��" + status + "\t" + "��" + status + ":" + count + "����");
	}

	public void use(String status, int count) {
		this.status = status;
		System.out.println("�豸״̬��" + status + "\t" + "��" + status + ":" + count + "����");
	}

	public App(String name, String site, String factory) {
		this.name = name;
		this.site = site;
		this.factory = factory;
		System.out.println("�豸���ƣ�" + name + "\nʹ�õص㣺" + site + "\n�������ң�" + factory);
	}

	public App(String name, String factory) {
		this(name, "����", factory);
	}

	public App(String name) {
		this(name, "����", "");
	}

	public static void main(String[] args) {
		App highSwitch = new App("���ø�ѹ������װ��", "3#�콺������ʱ����", "��Դ����");
		highSwitch.use(10);
		App beltConveyor = new App("��ʽ���ͻ�");
		beltConveyor.use(5, "ά��");
		App lowSwitch = new App("���õ�ѹ��յ������", "��Դ����");
		lowSwitch.use("����", 36);

	}

}
