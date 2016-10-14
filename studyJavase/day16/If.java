package com.demo.day16;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月9日 下午2:21:21
 */
public class If {

	public static void main(String[] args) {

		compare(2);
		tri(2);

		international("GREECE");
	}

	/**
	 * 
	 * @param country
	 */
	private static void international(String country) {
		if (country.equals("USA")) {
			System.out.println("you are now in USA");
		} else if (country.equals("CHINA")) {
			System.out.println("众善，迎至美之中");
		} else if (country.equals("JAPAN")) {
			System.out.println("日本へようこそ");
		} else if (country.equals("GREECE")) {
			System.out.println("Γεια σας, καλώς ήρθατε στην όμορφη στην Κίνα");
		} else {
			System.out.println("you are on earth!");
		}
	}

	private static void tri(int x) {
		System.out.println("2>x : " + ((x < 2) ? ++x : x--));

	}

	private static void compare(int x) {
		if (x < 2) {
			x++;
		} else {
			x--;
		}
		System.out.println("1>x : " + x);
	}

}
