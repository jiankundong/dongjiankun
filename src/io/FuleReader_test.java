package io;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FuleReader_test {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		FileReader fileReader=new FileReader("d:\\reader.txt");
		int len=0;
		while ((len=fileReader.read())!=-1) {
			System.out.print((char)len);
			
		}
		fileReader.close();
		FileWriter fileWriter=new FileWriter("d:\\reader1.txt");
		fileWriter.write("平凡的世界\r\n");
		fileWriter.write("路遥\r\n");
		fileWriter.close();
	}

}
