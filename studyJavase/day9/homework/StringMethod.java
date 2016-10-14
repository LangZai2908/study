package com.demo.day9.homework;

/**
 * String的所有方法
 * 
 * @author ChenChangJian
 * @createTime 2016年9月25日 下午1:42:43
 */
public class StringMethod {

	public static void main(String[] args) {

		String word = "Happy National Day(October,1st)";
		String word1 = "Happy New Year";

		System.out.println("charAt方法：");
		char charAt = word.charAt(8);
		System.out.println("8号字符：" + charAt);

		System.out.println("----------------------");
		System.out.println("codePointAt方法：");
		int codePA = word.codePointAt(8);
		System.out.println("8号字符的Unicode代码（ASCII）：" + codePA);

		System.out.println("----------------------");
		System.out.println("codePointBefore方法：");
		int codePB = word.codePointBefore(8);
		System.out.println("8号之前的一个字符的Unicode代码：" + codePB);

		System.out.println("----------------------");
		System.out.println("codePointCount方法：");
		int codePC = word.codePointCount(8, 18);
		System.out.println("8号与18号之间的Unicode代码数：" + codePC);

		System.out.println("----------------------");
		System.out.println("compareTo方法：");
		int compareTo = word.compareTo(word1);
		System.out.println("比较两个字符串的顺序(为正word>word1)：" + compareTo);

		System.out.println("----------------------");
		System.out.println("compareToIgnoreCase方法：");
		int compareToIgnoreCase = word.compareToIgnoreCase(word1);
		System.out.println("比较两个字符串的顺序(为正word>word1)：" + compareToIgnoreCase);

		System.out.println("----------------------");
		System.out.println("concat方法：");
		String concat = word.concat(word1);
		System.out.println("将word1连接到word的尾部：" + concat);

		System.out.println("----------------------");
		System.out.println("contains方法：");
		boolean contains = word.contains("Happy");
		System.out.println("判断word中是否包含Happy：" + contains);

		System.out.println("----------------------");
		System.out.println("contentEquals方法：");
		boolean contentEquals = word.contentEquals(word1);
		System.out.println("判断word是否与word1完全相同：" + contentEquals);

		System.out.println("----------------------");
		System.out.println("copyValueOf（功能与charAt相反）方法：");
		char[] data = { '1', '5', 'e', '7', '1', '5', 'e', '7', '1', '5', 'e', '7' };
		String copyValueOf = String.copyValueOf(data);
		System.out.println("通过copyValueOf将char数组转换成字符串：" + copyValueOf);
		System.out.println("从char[2]开始的5个字符转换成字符串" + String.copyValueOf(data, 2, 5));

		System.out.println("----------------------");
		System.out.println("endsWith方法：");
		boolean endsWith = word.endsWith("Day");
		System.out.println("判断word是否以Day结束：" + endsWith);

		System.out.println("----------------------");
		System.out.println("equals方法：");
		boolean equals = word.equals(word1);
		System.out.println("判断word是否与word1相同：" + equals);

		System.out.println("----------------------");
		System.out.println("equalsIgnoreCase方法：");
		boolean equalsIgnoreCase = word.equalsIgnoreCase(word1);
		System.out.println("判断word是否与word1相同（忽略大小写）：" + equalsIgnoreCase);

		System.out.println("----------------------");
		System.out.println("format方法：");
		String format = String.format("%05d", 12);
		System.out.println("判断word是否与word1相同（忽略大小写）：" + format);

		System.out.println("----------------------");
		System.out.println("getBytes方法：");
		byte[] getBytes = word.getBytes();
		for (int i = 0; i < getBytes.length; i++) {
			System.out.print(getBytes[i] + "\t");
		}
		System.out.println();
		System.out.println("将word转换成ASCII码");

		System.out.println("----------------------");
		System.out.println("getChars方法：");
		char[] dst = new char[20];
		word.getChars(0, 9, dst, 0);
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i] + "\t");
		}
		System.out.println();
		System.out.println("将word中的第0到9号字符复制到char型数组中");

		System.out.println("----------------------");
		System.out.println("hashCode方法：");
		int hashCode = word.hashCode();
		System.out.println("word的哈希码：" + hashCode);

		System.out.println("----------------------");
		System.out.println("indexOf方法：");
		int indexOf = word.indexOf(112);
		System.out.println("返回形参（数字表示Unicode码）第一次出现的索引：" + indexOf);

		System.out.println("----------------------");
		System.out.println("lastIndexOf方法：");
		int lastIndexOf = word.lastIndexOf(112);
		System.out.println("返回形参（数字表示Unicode码）最后一次出现的索引：" + lastIndexOf);

		System.out.println("----------------------");
		System.out.println("length方法：");
		int length = word.length();
		System.out.println("返回该字符串的长度：" + length);

		// System.out.println("----------------------");
		// System.out.println("matches方法：");
		// boolean matches = word.matches("Day");
		// System.out.println("返回该字符串的长度：" + matches);

		System.out.println("----------------------");
		System.out.println("offsetByCodePoints方法：");
		int offsetByCodePoints = word.offsetByCodePoints(1, 5);
		System.out.println("返回第1+5号字符的索引：" + offsetByCodePoints);

		System.out.println("----------------------");
		System.out.println("regionMatches方法：");
		boolean regionMatches = word.regionMatches(false, 2, word1, 3, 5);
		System.out.println("判断word与word1指定区域内的字符是否相等：" + regionMatches);

		System.out.println("----------------------");
		System.out.println("replace方法：");
		String replace = word.replace("p", " b");
		System.out.println("替换指定的字符：" + replace);

		System.out.println("----------------------");
		System.out.println("startsWith方法：");
		boolean startsWith = word.startsWith("Happ");
		System.out.println("判断word是否以指定的字符开始：" + startsWith);

		System.out.println("----------------------");
		System.out.println("substring方法：");
		String substring = word.substring(5, 10);
		System.out.println("返回一个从5号到10号的组成的一个新字符串：" + substring);

		System.out.println("----------------------");
		System.out.println("toCharArray方法：");
		char[] toCharArray = word.toCharArray();
		System.out.println("返回一个从5号到10号的组成的一个新字符串：");
		for (int i = 0; i < toCharArray.length; i++) {
			System.out.print(toCharArray[i]);
		}
		System.out.println();

		System.out.println("----------------------");
		System.out.println("toLowerCase方法：");
		String toLowerCase = word.toLowerCase();
		System.out.println("将字符串转换成小写：" + toLowerCase);

		System.out.println("----------------------");
		System.out.println("toString方法：");
		String toString = word.toString();
		System.out.println("返回对象本身：" + toString);

		System.out.println("----------------------");
		System.out.println("toUpperCase方法：");
		String toUpperCase = word.toUpperCase();
		System.out.println("将字符串转换成大写：" + toUpperCase);

		System.out.println("----------------------");
		System.out.println("trim方法：");
		String trim = word.trim();
		System.out.println("删除字符串前后的空白：" + trim);

		System.out.println("----------------------");
		System.out.println("trim方法：");
		String valueOf = String.valueOf(13135);
		System.out.println("将基本数据类型（包括char[]）转换成String类型：" + valueOf);

	}

}
