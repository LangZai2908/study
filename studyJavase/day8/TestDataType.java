package com.demo.day8;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��22�� ����11:13:12
 */
public class TestDataType {

	public static void main(String[] args) {

		// ����
		byte b = 1 * 2;
		byte a = b;
		System.out.println(b);
		System.out.println(a);
		System.out.println(a == b);

		short s = 1000;
		System.out.println("�����ͣ�" + s);
		int i = 1000000000;
		System.out.println("���ͣ�" + i);
		long l = 1000000000L;
		System.out.println("�����ͣ�" + l);

		// ������
		double d = 10.0000;
		double d1 = 1500.00;
		System.out.println("˫�����ͣ�" + d);
		System.out.println("˫�����ͣ�" + d1);

		float f = 10.00f;
		float f1 = 10.00F;
		System.out.println("�������ͣ�" + f1);
		System.out.println("�������ͣ�" + f1);

		// �ַ���
		char c = 'd';
		char c1 = 'f';
		char c2 = '��';
		System.out.println("�ַ��ͣ�" + c2);
		System.out.println((char) 38472);

		// ������
		boolean isNice = true;
		boolean isBad = false;

		System.out.println("������" + isNice);
		System.out.println("������" + isBad);

		int b1 = 10000000;
		// ���벻ͨ��
		// byte c == b;

		float f11 = 1000f;
		double d11 = f11;

		double d2 = 10000.00;
		// ���벻ͨ��
		// float f2 = d2;

		char c12 = 'a';
		int i1 = c12;
		// ���벻ͨ��
		// short s = c;
		long l1 = c;

		int i2 = -1000;
		float f21 = i2;
		System.out.println(f21);

		short short1 = 32767;
		byte byte1 = 51;
		int long2 = byte1 * short1;

		for (int j = 0; j < 10; j++) {
			System.out.println((byte) (++short1));

		}

	}

}
