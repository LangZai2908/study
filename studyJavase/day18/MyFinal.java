package com.demo.day18;

/**
 *
 * @author ChenChangJian
 * @createTime 2016��10��11�� ����11:17:10
 */
public class MyFinal {

	private String name;

	private final String BRAND_NAME;

	private static final String BRAND = "ICS%S";

	private final int NUMBER = 5;

	// �������͵�final���ԣ�ָ�������úͶ���Ĺ�ϵ�ǲ��ɱ�ģ�Ҳ�������� ����ָ����������
	private final Company COMPANY = new Company("ICS%S");

	/**
	 * 
	 */
	public MyFinal() {
		// final ���Ա�����ʹ��֮ǰ�������Զ�����߹��췽������ɳ�ʼ����
		// The blank final field BRAND_NAME may not have been initialized
		BRAND_NAME = "ICS%S";
	}

	public void testFinal() {
		// final�������޷����޸�
		// The final field MyFinal.BRAND_NAME cannot be assigned
		// BRAND_NAME="ICS%S";
		// COMPANY = new Company("microsoft");

		// final���������͵������ǿ��޸ĵġ�
		COMPANY.setName("microsoft");

	}

	public void testFinalParam(final int x, final Company cpny) {
		System.out.println("x: " + x);
		System.out.println("cpny: " + cpny);
		System.out.println(cpny.getName());
		cpny.setName("xxxx");
		System.out.println(cpny.getName());

		// The final local variable x cannot be assigned
		// It must be blank and not using a compound assignment
		// x=6;�������

	}

}
