package com.demo.day8;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��22�� ����3:54:37
 */
public class IntConvert {

	public static void main(String[] args) {
		long l = 1000l;
		byte b = 1;
		short s = 2;
		int i = 3;
		// ����������
		// �����long���룬���Ϊlong
		// ���û��long���룬���Ϊint
		long r = l * i;

		int r1 = i * b;
		int r2 = i * s;
		int r3 = b * s;

		double d = 12d;
		float f = 1f;

		// ��double����float����ļ�����Ǹ������
		// ���������㣬�����double���룬�����double
		// ���û�У�����float
		double r4 = d + f;

		float r5 = f + l;
	}

}
