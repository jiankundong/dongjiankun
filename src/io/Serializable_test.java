package io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
		//Person p1=new Person(20,"Mike");
		//FileOutputStream fout=new FileOutputStream("person.txt");
		//ObjectOutputStream oout=new ObjectOutputStream(fout);
		//oout.writeObject(p1);
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("person.txt"));
		Person p=(Person) oin.readObject();
		System.out.println(p);
	}

}
