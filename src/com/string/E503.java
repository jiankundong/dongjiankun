package com.string;

public class E503 {
	
	public static void main(String[] args) {
		String str="j1董a73v建0729a752坤1";
		char[]charArray=str.toCharArray();
		System.out.println("");
		for(int i=0; i<charArray.length;i++) {
			if (i !=charArray.length-1) {
				System.out.println(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}
		System.out.println(""
				+String.valueOf(12));
		System.out.println(""
				+str.toUpperCase());
	}

}
