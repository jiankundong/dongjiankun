package com.string;

public class E505 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s1="Starter";
		String s2="St";
		System.out.println("�ж��Ƿ����ַ���St��ͷ��"+s1.startsWith("St"));
		System.out.println("�ж��Ƿ����ַ���er��β��"+s1.endsWith("er"));
		System.out.println("�ж��Ƿ�����ַ���ar��"+s1.contains("ar"));
		System.out.println("�ж��ַ����Ƿ�Ϊ�գ�"+s1.isEmpty());
		System.out.println("�ж������ַ����Ƿ���ȣ�"+s1.equals(s2));
	}

}
