package com.demo.coreJava;
/**
* 方法重载
* @author ChenChangJian
* @createTime 2016年9月18日  上午11:17:20
*/
public class Overload {
	/**
	 * 无返回值的a-b
	 * @param a
	 * @param b
	 */
	public void sub(int a,int b){
		System.out.println(a-b);
	}
	
	/**
	 * 3个数相减
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
	 * 参数数据类型顺序1
	 * @param a
	 * @param b
	 */
	public void sub(int a,double b){
		System.out.println(a-b);
	}
	
	/**
	 * 参数数据类型顺序2
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
