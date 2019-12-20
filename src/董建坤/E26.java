package 董建坤;
@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E26 {
	public static void main(String[] args) {
		printName("刘德华",new PersonBuilder() {
			
			@Override
			public Person buildPerson(String name) {
				Person ren=new Person(name);
				// TODO 自动生成的方法存根
				return ren;
			}
		});
		printName("郭富城",name->new Person(name));
		printName("张学友",Person::new);
	}
	public static void printName(String name,PersonBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
	}
}
