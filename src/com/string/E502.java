package com.string;

public class E502 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[]= {1,2,3};
		System.out.println("����a�ĳ����ǣ�"+a.length);
		String s="abcabcbacdba.txt";
		System.out.println("懂"
				+ "ַ���s�ĵ�һ���ַ�Ϊ"+s.charAt(0));
		System.out.println("�ַ���s�ĵڶ����ַ�Ϊ"+s.charAt(1));
		System.out.println("�ַ���s�ĳ���Ϊ"+s.length());
		System.out.println("�ַ���c��һ�γ��ֵ�λ��Ϊ"+s.indexOf('c'));
		System.out.println("�ַ���c���һ�γ��ֵ�λ��Ϊ"+s.lastIndexOf('c'));
		System.out.println("���ַ�����һ�γ��ֵ�λ��Ϊ"+s.indexOf("ab"));
		System.out.println("���ַ������һ�γ��ֵ�λ��Ϊ"+s.lastIndexOf("ab"));
		System.out.println("�Ƿ���"+s.endsWith("txt"));
		char[] charArray=s.toCharArray();
		for(char zf : charArray) {
		if(s.endsWith(""+zf))	
			System.out.print(zf);
        else 
			System.out.print(zf+",");
		
		
		
	}

	}
	}
