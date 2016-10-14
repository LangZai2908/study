package com.demo.day16.homework;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午4:44:17
 */
public class AirTicket {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private long book() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入预订时间（例如：10-01）");
		String date = in.nextLine();
		return new Long(date.replaceAll(" ", "").replace("-", ""));

	}

	private boolean isSale() {
		long date = book();
		if (date >= 101 && date <= 103 || date >= 501 && date <= 503
				|| date >= 1001 && date <= 1007) {
			return false;
		}
		return true;
	}

	public double sellPrice() {
		return isSale() ? 0.8 * price : price;
	}

	public AirTicket(double price) {
		super();
		this.price = price;
	}
	// private long nowTime() {
	// Date date = new Date();
	// SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmmss");
	// String str = sdf.format(date);
	// return new Long(str);
	// }

	public static void main(String[] args) {
		AirTicket air = new AirTicket(1000);
		System.out.println("全额票价为" + air.getPrice());
		System.out.println(air.sellPrice());

	}

}
