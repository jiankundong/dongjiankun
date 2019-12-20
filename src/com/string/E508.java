package com.string;

public class E508 {
	public static void main(String[] args) {
	System.out.println("1.添加---------------");add();
	System.out.println("2.修改---------------");update();
	System.out.println("3.删除---------------");delete();

	}
	
	private static void add() {
		// TODO 自动生成的方法存根
		StringBuffer sb=new StringBuffer();
		sb.append("ABC");
		System.out.println("append添加结果："+sb);
		sb.insert(3, "DE");
		System.out.println("insert添加结果："+sb);
	}
	public static void update() {
		StringBuffer sb=new StringBuffer("ABAAA");
		sb.setCharAt(2, 'C');
		System.out.println("修改指定位置字符结果："+sb);
		sb.replace(3, 5, "DE");
		System.out.println("替换指定位置的结果："+sb);
		System.out.println("字符串翻转结果："+sb.reverse());
	}
	private static void delete() {
		// TODO 自动生成的方法存根
		StringBuffer sb=new StringBuffer("ABCDEFG");
		sb.delete(3, 7);
		System.out.println("删除指定位置字符结果："+sb);
		sb.deleteCharAt(2);
		System.out.println("删除指定位置的结果："+sb);
		sb.delete(0,sb.length());
		System.out.println("清除缓冲区结果："+sb);
	}
}
