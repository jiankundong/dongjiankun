package com.string;

public class E17 {

	public static void main(String[] args) {
		//自动装箱：将基本类型的变量a赋给Integer类型的变量b
		int a=20;
		Integer b=a;
		//自动拆箱：将Integer类型的变量b赋给基本类型的变量c
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
