package com.demo.coreJava;
/**
* ��������
* @author ChenChangJian
* @createTime 2016��9��18��  ����11:17:20
*/
public class Overload {
	/**
	 * �޷���ֵ��a-b
	 * @param a
	 * @param b
	 */
	public void sub(int a,int b){
		System.out.println(a-b);
	}
	
	/**
	 * 3�������
	 * @param a
	 * @param b
	 * @param c
	 * @return a-b-c
	 */
	public int sub(int a,int b ,int c){
		System.out.println(a-b-c);
		return a-b-c;
	}
	
	/**
	 * ������������˳��1
	 * @param a
	 * @param b
	 */
	public void sub(int a,double b){
		System.out.println(a-b);
	}
	
	/**
	 * ������������˳��2
	 * @param a
	 * @param b
	 */
	public void sub(double a,int b){
		System.out.println(a-b);
	}
	
	public static void main(String[] args){
		Overload sub=new Overload();
		sub.sub(5, 3);
		sub.sub(5, 3,2);
		sub.sub(5, 3.2);
		sub.sub(5.8, 3);
	}

}
