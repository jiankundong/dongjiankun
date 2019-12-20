package jihe_com;

import java.util.HashSet;

class person{
	String name;
	int age; 
	public person() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name+ ":"+age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
	
		person other = (person) obj;
		return name.equals(other.name);
	}
	
}
public class HS_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashSet<person> hs=new HashSet<person>();
		hs.add(new person("jack",20));
		hs.add(new person("jack",20));
		hs.add(new person("Tom",19));
		System.out.println(hs);
	}

}
