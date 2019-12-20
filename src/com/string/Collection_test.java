package com.string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class Collection_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList <String> list =new ArrayList<String>();
		list.add("stu1");
		list.add("stu2");
		list.add("stu3");
		list.add("stu4");
		System.out.println("集合的长度"+list.size());
		System.out.println("第二个元素是"+list.get(1));
		
		LinkedList<String> list2=new LinkedList<>();
		list2.add("s1");
		list2.add("s2");
		System.out.println(list2);
		list2.offer("offer");
		list2.push("push");
		System.out.println(list2);
		System.out.println("第一个元素是"+list2.get(0));
		System.out.println("第一个元素是"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);
		
}
}
