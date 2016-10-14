package com.demo.day11.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��9��27�� ����4:57:29
 */
public class Username {

	private String username;

	public boolean isStandard0() {

		// ���û���ת����һ���ַ�����
		char[] temp = username.toCharArray();

		char[] tempIs = new char[temp.length];

		int tempCount = 0;

		for (int i = 0; i < temp.length; i++) {

			// ����i���ַ�ת����Character����
			Character tempCharacter = new Character(temp[i]);

			// �ж�ÿ��Character�����Ƿ���Сд����д��_��@
			boolean isTemp = Character.isDigit(tempCharacter) || Character.isLowerCase(tempCharacter)
					|| Character.isUpperCase(tempCharacter) || tempCharacter.equals('_') || tempCharacter.equals('@');

			if (!isTemp) {
				tempIs[tempCount] = temp[i];
				tempCount++;
			}
		}
		if (tempCount == 0) {
			print("����ɹ�");
			return true;
		} else {
			print("�벻Ҫ���룺" + new String(tempIs).trim());
			return false;
		}
	}

	public boolean isStandard1() {

		byte[] tempIs = new byte[username.length()];
		int tempCount = 0;
		byte[] tempByte = username.getBytes();
		for (int i = 0; i < tempByte.length; i++) {
			if (!(tempByte[i] >= 48 && tempByte[i] <= 57 || tempByte[i] >= 64 && tempByte[i] <= 90 || tempByte[i] == 95
					|| tempByte[i] >= 97 && tempByte[i] <= 122)) {
				tempIs[tempCount] = tempByte[i];
				tempCount++;
			}

		}
		if (tempCount == 0) {
			print("����ɹ�");
			return true;
		} else {
			print("�벻Ҫ���룺" + new String(tempIs).trim());
			return false;
		}
	}

	public Username(String username) {
		this.username = username;
	}

	public static void main(String[] args) {

		// ����һ���û���
		Scanner importName = new Scanner(System.in);
		System.out.print("�û�����");
		String username = importName.next();

		Username user = new Username(username);
		user.isStandard1();

	}

	public static void print(String name) {
		System.out.println(name);
	}

}
