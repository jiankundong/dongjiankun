package com.gc;
class Person{
	public void finalize() {
		System.out.println("���󽫱���Ϊ��������");
	}
}
public class E37 {
 private  static void recyclegWaste1() {
	// TODO �Զ����ɵķ������
	 Person  p1=new Person();
	 p1=null;
	 int i=1;
	 while(i<10) {
		 System.out.println("����һѭ���С�����");
		 i++;
	 }

}
 private  static void recyclegWaste2() {
		// TODO �Զ����ɵķ������
		 Person  p2=new Person();
		 p2=null;
		 System.gc();
		 int i=1;
		 while(i<10) {
			 System.out.println("������ѭ���С�����");
			 i++;
		 }

	}
 public static void main(String[] args) {
		recyclegWaste1();
		System.out.println("==============");
		recyclegWaste2();
	}
}
