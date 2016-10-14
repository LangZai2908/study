package com.demo.day14.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��4�� ����4:29:53
 */
public class GuessNum {

	private Scanner in = new Scanner(System.in);
	/**
	 * �ɼ�
	 */
	private int mark = 100;
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * �²����
	 */
	private int count;
	/**
	 * �洢
	 */
	private String storage;

	private void setMark() {
		mark = 100 - 5 * (count - 1);
	}

	private void setUserName() {
		userName = in.next();
	}

	/**
	 * ������Ϸ
	 */
	private void guessGame() {
		Random random = new Random();
		int num = random.nextInt(200);
		int guessNum = -1;
		for (; guessNum != num; count++) {
			System.out.print("��" + count + "������(0~200)��");
			guessNum = in.nextInt();
			String prompt = guessNum > num ? "����" : "С��";
			if (guessNum != num) {
				System.out.println(prompt);
			} else {
				System.out.println("��ϲ���������Ϸ");
			}

		}
		System.out.print("�������û�����");
		setUserName();
		setMark();
	}

	/**
	 * �жϳɼ��Ƿ�洢
	 * 
	 * @throws Exception
	 */
	private void judge() throws Exception {
		System.out.print("�ɼ��Ƿ�¼�����а�(Y\\N)��");
		String judge = in.next();
		if (judge.equals("Y")) {
			out();
		} else {

		}
	}

	/**
	 * ȡ�ô洢��ʽ
	 * 
	 * @return
	 */
	private String getStorage() {
		String str = userName + ":" + mark + " ";
		return str;
	}

	/**
	 * ���û����ݴ洢��
	 * 
	 * @throws Exception
	 */
	private void out() throws Exception {
		/**
		 * �û����ݴ洢λ��
		 */
		File file = new File("d:" + File.separator + "guessNum" + File.separator + "sankingList.txt");
		// �ж�·���Ƿ���ڣ��粻����Ҫ����·��
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}

		// ʵ����OutputStream
		OutputStream output = new FileOutputStream(file, true);

		// ���ַ���getStorageת����byte����;
		byte[] data = getStorage().getBytes();
		// ��byte����д���ļ���
		output.write(data);

		// �ر���Դ
		output.close();

	}

	/**
	 * �����а�
	 * 
	 * @throws Exception
	 */
	private void rank() throws Exception {
		/**
		 * �û����ݴ洢λ��
		 */
		File file = new File("d:" + File.separator + "guessNum" + File.separator + "sankingList.txt");
		// �ж��Ƿ�����ļ�
		if (file.exists()) {

			// ʹ��InputStream���ж�ȡ
			InputStream input = new FileInputStream(file);

			byte[] data = new byte[1024];// ׼��һ��1024������
			int foot = 0;// ����ű�
			int temp = 0;// ÿ�ζ�ȡ���ֽ�����
			while ((temp = input.read()) != -1) {
				data[foot++] = (byte) temp;
			}
			// �ر���Դ
			input.close();
			// ��ȡ����byte����ת����String��ȥ��ǰ�����󵼿հ�
			String str = new String(data).trim();
			// ��String��" "���𿪣�ʹuser�����д洢ÿ���û�������
			String[] user = str.split(" ");
			// ��user��������ȡ�ɼ���ʹ֮��Ϊint������mark
			int[] mark = new int[user.length];
			for (int i = 0; i < user.length; i++) {
				String[] temp1 = user[i].split(":");
				Integer a = new Integer(temp1[1]);
				mark[i] = a.intValue();
			}
			// ����int�����������ð������
			int temp2;
			String temp3;
			for (int i = 0; i < mark.length; i++) {
				for (int j = 0; j < mark.length - 1; j++) {
					if (mark[j] < mark[j + 1]) {
						// �ɼ�
						temp2 = mark[j];
						mark[j] = mark[j + 1];
						mark[j + 1] = temp2;
						// �û�
						temp3 = user[j];
						user[j] = user[j + 1];
						user[j + 1] = temp3;
					}
				}
			}
			System.out.println("�û����а�");
			for (int i = 0; i < user.length; i++) {
				System.out.println(user[i]);
			}

		}
	}

	private void resetting() {
		System.out.println("�Ƿ��������а�(Y\\N):");
		if (in.next().equals("Y")) {
			File file = new File("d:" + File.separator + "guessNum" + File.separator + "sankingList.txt");
			file.delete();
		}
	}

	public void Game() throws Exception {
		guessGame();
		System.out.println("�û�����" + userName + "\n�ɼ���" + mark + "��");
		judge();
		rank();
		resetting();
		in.close();

	}

	public static void main(String[] args) throws Exception {

		GuessNum test = new GuessNum();
		test.Game();

	}

}
