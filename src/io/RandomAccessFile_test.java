package io;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile raf=new RandomAccessFile("times.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if(times>0) {
			System.out.println("您可以式用"+times+"次");
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else {
			System.out.println("试用次数已用完");
		}
		raf.close();
		
		
	}

}
