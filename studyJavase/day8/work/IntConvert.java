package com.demo.day8.ChangJian;

public class IntConvert {

	public static void main(String[] args) {

		byte b = 13;
		short s = 15;
		int i = 154;
		long l = 15143l;
		float f = 1315.55f;
		double d = 153531.454;

		// ��������
		// ��long����
		long rl1 = l * b;
		long rl2 = l * s;
		long rl3 = l * i;

		// ��int����
		int ri1 = i * b;
		int ri2 = i * s;

		// û��int����
		int ri3 = b * s;

		// ����������
		double rd1 = d * f;
		double rd2 = d * l;

		float rf = f * l;

	}
}