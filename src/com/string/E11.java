package com.string;

public class E11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] srcArray= {101,102,103,104,105,106};
		int[] destArray= {201,202,203,204,205,101,102,103,104,105,106};
		System.arraycopy(srcArray,2,destArray,0,4);
		for (int i = 0; i < destArray.length; i++) {
			System.out.println(i+":"+destArray[i]);	
		}
		
	}

}
