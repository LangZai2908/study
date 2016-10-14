package com.demo.day11.homework;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月27日 下午4:57:29
 */
public class Username {

	private String username;

	public boolean isStandard0() {

		// 将用户名转换成一个字符数组
		char[] temp = username.toCharArray();

		char[] tempIs = new char[temp.length];

		int tempCount = 0;

		for (int i = 0; i < temp.length; i++) {

			// 将第i个字符转换成Character类型
			Character tempCharacter = new Character(temp[i]);

			// 判断每个Character类型是否是小写、大写、_、@
			boolean isTemp = Character.isDigit(tempCharacter) || Character.isLowerCase(tempCharacter)
					|| Character.isUpperCase(tempCharacter) || tempCharacter.equals('_') || tempCharacter.equals('@');

			if (!isTemp) {
				tempIs[tempCount] = temp[i];
				tempCount++;
			}
		}
		if (tempCount == 0) {
			print("输入成功");
			return true;
		} else {
			print("请不要输入：" + new String(tempIs).trim());
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
			print("输入成功");
			return true;
		} else {
			print("请不要输入：" + new String(tempIs).trim());
			return false;
		}
	}

	public Username(String username) {
		this.username = username;
	}

	public static void main(String[] args) {

		// 输入一个用户名
		Scanner importName = new Scanner(System.in);
		System.out.print("用户名：");
		String username = importName.next();

		Username user = new Username(username);
		user.isStandard1();

	}

	public static void print(String name) {
		System.out.println(name);
	}

}
