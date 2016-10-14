package com.demo.day17;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��10�� ����11:54:06
 */
public class App {

	public static void main(String[] args) {
		// testPerson();
		// testBreak();
		testBreakLabel();
		testContinue();

	}

	private static void testContinue() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ˣ�����ռǣ���" + (i + 1) + "��");
			System.out.println("����Ӱ");
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("�Է�");
			System.out.println("����");
			if (i == 5) {
				System.out.println("����");
			}
		}

	}

	private static void testBreakLabel() {
		outer: for (int i = 0; i < 10; i++) {
			inner: for (int j = 0; j < 10; j++) {
				if (i + j == 15) {
					System.out.println("i=" + i + " j=" + j + "��ֹ�ⲿѭ��");
					break outer;
				}
				System.out.println("i=" + i + " j=" + j + "�ڲ�ѭ��");
			}
			System.out.println("i=" + i + "�ⲿѭ��");

		}

	}

	private static void testBreak() {
		int sum = 0;
		for (int i = 0; i < 6666; i++) {
			sum += i;
			if (sum >= 6666) {
				System.out.println("i= " + i + " sum= " + sum + "���ˣ�");
			}
		}
	}

	private static void testPerson() {
		Person[] person = new Person[3];
		person[0] = new Person("С��", "����", 5000);
		person[1] = new Person("С��", "����", 2000);
		person[2] = new Person("С��", "����", 2000);
		Occupation occupation = new Occupation();
		occupation.setSalary(3000);
		// int i = 0;
		// while (i < person.length) {
		// if (person[i].recruit(occupation) && occupation.recruit(person[i])) {
		// System.out.println("��ϲ" + person[i].getName() + "��¼ȡ ��");
		// }
		// i++;
		// }
		for (int i = 0; i < person.length; i++) {
			if (person[i].recruit(occupation) && occupation.recruit(person[i])) {
				System.out.println("��ϲ" + person[i].getName() + "��¼ȡ ��");
			}
		}
		for (int i = 0;; i++) {
			System.out.println(i);
		}
	}

}
