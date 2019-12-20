package com.string;

public class E18 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			int num=123;
			//通过String.valueOf()方法将基本类型转换为字符串
			String string=String.valueOf(num);
			System.out.println("将int变量转换为字符串的结果"+string);
			//通过包装类的valueOf()静态方法将基本类型和字符串转换为包装类
			String str="998";
			Integer integer=Integer.valueOf(num);
			Integer integer2=Integer.valueOf(str);
			System.out.println("将int变量转换为包装类的结果"+integer);
			System.out.println("将字符串变量转换为包装类的结果"+integer2);
			Integer integer3=new Integer(num);
			Integer integer4=new Integer(str);
			System.out.println("通过构造器将int变量转换为包装类的结果"+integer3);
			System.out.println("通过构造器将字符串变量转换为包装类的结果"+integer4);
			int parseInt=integer.parseInt(str);
			System.out.println("将字符串变量转换为基本类型的结果"+parseInt);
			String string2=integer.toString();
			System.out.println("将包装串变量转换为字符类的结果"+string2);
	}

}
