package com.demo.day8.ChangJian;

import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年9月22日 下午4:34:38
 */
public class Training {

	public double centigrade(double fahrenheit) {
		double centigrade = 5.0 / 9.0 * (fahrenheit - 32);
		return centigrade;
	}

	public static void main(String[] args) {

		System.out.println("---------------第一题:求表达式的值---------------");
		int a = 2;
		int b = 3;
		float x = 3.5f;
		float y = 2.5f;
		// 先算a+b得5，再将其转换成float类型为5.0，float除以int结果为float类型为2.5
		// 先将x和y强制转换成int类型再取余得1，最后相加得3.5
		float result = (float) (a + b) / 2 + (int) x % (int) y;
		System.out.println("表达式的值为：" + result);

		System.out.println("---------------第二题:求两个数的最大值---------------");
		Scanner in = new Scanner(System.in);
		System.out.print("第一个数为：");
		int a1 = in.nextInt();
		System.out.print("第二个数为：");
		int b1 = in.nextInt();
		int max = a1 > b1 ? a1 : b1;
		System.out.println("两个数中最大值为：" + max);

		System.out.println("---------------第三题:分别输出一个数的百位、十位、个位---------------");
		int a2 = in.nextInt();
		int hundred = a2 / 100;
		System.out.println("这个数的百位：" + hundred);
		int ten = (a2 - hundred * 100) / 10;
		System.out.println("这个数的十位：" + ten);
		int unit = (a2 - hundred * 100) % 10;
		System.out.println("这个数的个位：" + unit);

		System.out.println("---------------第四题:将华氏温度转换成摄氏温度---------------");
		Training temp = new Training();
		System.out.print("请输入华氏温度：");
		int a4 = in.nextInt();
		System.out.println("摄氏温度：" + temp.centigrade(a4));

		System.out.println("---------------第五题:输入两个数将之交换---------------");
		System.out.print("请输入a：");
		int a3 = in.nextInt();
		System.out.print("请输入b：");
		int b4 = in.nextInt();
		System.out.print("a为：" + a3);
		System.out.println("\t\tb为：" + b4);
		int storage;
		storage = a3;
		a3 = b4;
		b4 = storage;
		System.out.print("a为：" + a3);
		System.out.println("\tb为：" + b4);

	}

}
