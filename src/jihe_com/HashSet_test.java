package jihe_com;

import java.util.HashSet;
class Student{
	String id;
	String name;
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return  id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return id.equals(other.id);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
public  class HashSet_test {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu1=new Student("1","mike");
		Student stu2=new Student("2","Bob");
		Student stu3=new Student("3","Tom");
		HashSet<Student> hset=new HashSet<Student>();
		   hset.add(stu1);
		   hset.add(stu2);
		   hset.add(stu3);
		   System.out.println(hset);
	}
	}
	

