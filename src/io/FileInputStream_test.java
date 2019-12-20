package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream_test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		FileInputStream fin=new FileInputStream("d:\\test.txt");
		FileOutputStream fout=new FileOutputStream("d:\\dest.txt");
		int b=fin.read();
		while (b!=-1) {
			System.out.println(b);
			fout.write(b);
			b=fin.read();
			
		}
		fin.close();
		fout.close();
	}

}
