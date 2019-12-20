package jihe_com;

import java.util.TreeSet;

class Teacher implements Comparable{
	String name;
	int age;
	
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return  name + " :" + age;
	}

	@Override
	public int compareTo(Object o) {
		Teacher teacher=(Teacher)o;
		return this.age-teacher.age;
	}
	
}
public abstract class TreeSet_test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeSet ts=new TreeSet();
		ts.add(new Teacher("马群群", 19));
		ts.add(new Teacher("冯波", 22));
		ts.add(new Teacher("通娃", 21));
		ts.add(new Teacher("亮亮", 20));
		System.out.println(ts);
	}

}
