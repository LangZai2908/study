package com.demo.day6;
/**
* @author �²���
*/
import java.util.Random;
import java.util.Scanner;

public class RocknRoll {
	private static String[] names = { "��˧", "����", "�Ž�", "����", "������", "������", "�²���", "����", "���", "��С��", "������", "�˽���",
			"������", "������", "������", "���ӳ�", "������", "ʩ����", "�α�", "��ɭ", "����", "ԭ��", "�����", "����", "������", "�ܴ�ӱ", "��ʤ��", "��˼��" };

	public int[] save = new int[28];

	public static void main(String[] args) {

		RocknRoll roll = new RocknRoll();
		Scanner contral = new Scanner(System.in);
		int i = 0;

		loop1: for (; i < 28; i++) {
			int randomInt = new Random().nextInt(28);
			randomInt++;
			for (int j = 0; j < 28; j++) {
				if (roll.save[j] == randomInt) {
					randomInt = new Random().nextInt(28);
					randomInt++;
					j = -1;
				} else if (j == i) {
					roll.save[i] = randomInt;
				}
			}
			String next = contral.nextLine();
			System.out.println((randomInt) + "��:" + names[--randomInt]);

		}

	}
}
