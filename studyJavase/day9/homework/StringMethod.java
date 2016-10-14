package com.demo.day9.homework;

/**
 * String�����з���
 * 
 * @author ChenChangJian
 * @createTime 2016��9��25�� ����1:42:43
 */
public class StringMethod {

	public static void main(String[] args) {

		String word = "Happy National Day(October,1st)";
		String word1 = "Happy New Year";

		System.out.println("charAt������");
		char charAt = word.charAt(8);
		System.out.println("8���ַ���" + charAt);

		System.out.println("----------------------");
		System.out.println("codePointAt������");
		int codePA = word.codePointAt(8);
		System.out.println("8���ַ���Unicode���루ASCII����" + codePA);

		System.out.println("----------------------");
		System.out.println("codePointBefore������");
		int codePB = word.codePointBefore(8);
		System.out.println("8��֮ǰ��һ���ַ���Unicode���룺" + codePB);

		System.out.println("----------------------");
		System.out.println("codePointCount������");
		int codePC = word.codePointCount(8, 18);
		System.out.println("8����18��֮���Unicode��������" + codePC);

		System.out.println("----------------------");
		System.out.println("compareTo������");
		int compareTo = word.compareTo(word1);
		System.out.println("�Ƚ������ַ�����˳��(Ϊ��word>word1)��" + compareTo);

		System.out.println("----------------------");
		System.out.println("compareToIgnoreCase������");
		int compareToIgnoreCase = word.compareToIgnoreCase(word1);
		System.out.println("�Ƚ������ַ�����˳��(Ϊ��word>word1)��" + compareToIgnoreCase);

		System.out.println("----------------------");
		System.out.println("concat������");
		String concat = word.concat(word1);
		System.out.println("��word1���ӵ�word��β����" + concat);

		System.out.println("----------------------");
		System.out.println("contains������");
		boolean contains = word.contains("Happy");
		System.out.println("�ж�word���Ƿ����Happy��" + contains);

		System.out.println("----------------------");
		System.out.println("contentEquals������");
		boolean contentEquals = word.contentEquals(word1);
		System.out.println("�ж�word�Ƿ���word1��ȫ��ͬ��" + contentEquals);

		System.out.println("----------------------");
		System.out.println("copyValueOf��������charAt�෴��������");
		char[] data = { '1', '5', 'e', '7', '1', '5', 'e', '7', '1', '5', 'e', '7' };
		String copyValueOf = String.copyValueOf(data);
		System.out.println("ͨ��copyValueOf��char����ת�����ַ�����" + copyValueOf);
		System.out.println("��char[2]��ʼ��5���ַ�ת�����ַ���" + String.copyValueOf(data, 2, 5));

		System.out.println("----------------------");
		System.out.println("endsWith������");
		boolean endsWith = word.endsWith("Day");
		System.out.println("�ж�word�Ƿ���Day������" + endsWith);

		System.out.println("----------------------");
		System.out.println("equals������");
		boolean equals = word.equals(word1);
		System.out.println("�ж�word�Ƿ���word1��ͬ��" + equals);

		System.out.println("----------------------");
		System.out.println("equalsIgnoreCase������");
		boolean equalsIgnoreCase = word.equalsIgnoreCase(word1);
		System.out.println("�ж�word�Ƿ���word1��ͬ�����Դ�Сд����" + equalsIgnoreCase);

		System.out.println("----------------------");
		System.out.println("format������");
		String format = String.format("%05d", 12);
		System.out.println("�ж�word�Ƿ���word1��ͬ�����Դ�Сд����" + format);

		System.out.println("----------------------");
		System.out.println("getBytes������");
		byte[] getBytes = word.getBytes();
		for (int i = 0; i < getBytes.length; i++) {
			System.out.print(getBytes[i] + "\t");
		}
		System.out.println();
		System.out.println("��wordת����ASCII��");

		System.out.println("----------------------");
		System.out.println("getChars������");
		char[] dst = new char[20];
		word.getChars(0, 9, dst, 0);
		for (int i = 0; i < dst.length; i++) {
			System.out.print(dst[i] + "\t");
		}
		System.out.println();
		System.out.println("��word�еĵ�0��9���ַ����Ƶ�char��������");

		System.out.println("----------------------");
		System.out.println("hashCode������");
		int hashCode = word.hashCode();
		System.out.println("word�Ĺ�ϣ�룺" + hashCode);

		System.out.println("----------------------");
		System.out.println("indexOf������");
		int indexOf = word.indexOf(112);
		System.out.println("�����βΣ����ֱ�ʾUnicode�룩��һ�γ��ֵ�������" + indexOf);

		System.out.println("----------------------");
		System.out.println("lastIndexOf������");
		int lastIndexOf = word.lastIndexOf(112);
		System.out.println("�����βΣ����ֱ�ʾUnicode�룩���һ�γ��ֵ�������" + lastIndexOf);

		System.out.println("----------------------");
		System.out.println("length������");
		int length = word.length();
		System.out.println("���ظ��ַ����ĳ��ȣ�" + length);

		// System.out.println("----------------------");
		// System.out.println("matches������");
		// boolean matches = word.matches("Day");
		// System.out.println("���ظ��ַ����ĳ��ȣ�" + matches);

		System.out.println("----------------------");
		System.out.println("offsetByCodePoints������");
		int offsetByCodePoints = word.offsetByCodePoints(1, 5);
		System.out.println("���ص�1+5���ַ���������" + offsetByCodePoints);

		System.out.println("----------------------");
		System.out.println("regionMatches������");
		boolean regionMatches = word.regionMatches(false, 2, word1, 3, 5);
		System.out.println("�ж�word��word1ָ�������ڵ��ַ��Ƿ���ȣ�" + regionMatches);

		System.out.println("----------------------");
		System.out.println("replace������");
		String replace = word.replace("p", " b");
		System.out.println("�滻ָ�����ַ���" + replace);

		System.out.println("----------------------");
		System.out.println("startsWith������");
		boolean startsWith = word.startsWith("Happ");
		System.out.println("�ж�word�Ƿ���ָ�����ַ���ʼ��" + startsWith);

		System.out.println("----------------------");
		System.out.println("substring������");
		String substring = word.substring(5, 10);
		System.out.println("����һ����5�ŵ�10�ŵ���ɵ�һ�����ַ�����" + substring);

		System.out.println("----------------------");
		System.out.println("toCharArray������");
		char[] toCharArray = word.toCharArray();
		System.out.println("����һ����5�ŵ�10�ŵ���ɵ�һ�����ַ�����");
		for (int i = 0; i < toCharArray.length; i++) {
			System.out.print(toCharArray[i]);
		}
		System.out.println();

		System.out.println("----------------------");
		System.out.println("toLowerCase������");
		String toLowerCase = word.toLowerCase();
		System.out.println("���ַ���ת����Сд��" + toLowerCase);

		System.out.println("----------------------");
		System.out.println("toString������");
		String toString = word.toString();
		System.out.println("���ض�����" + toString);

		System.out.println("----------------------");
		System.out.println("toUpperCase������");
		String toUpperCase = word.toUpperCase();
		System.out.println("���ַ���ת���ɴ�д��" + toUpperCase);

		System.out.println("----------------------");
		System.out.println("trim������");
		String trim = word.trim();
		System.out.println("ɾ���ַ���ǰ��Ŀհף�" + trim);

		System.out.println("----------------------");
		System.out.println("trim������");
		String valueOf = String.valueOf(13135);
		System.out.println("�������������ͣ�����char[]��ת����String���ͣ�" + valueOf);

	}

}
