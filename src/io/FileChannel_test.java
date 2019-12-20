package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

import javax.print.attribute.Size2DSyntax;

public class FileChannel_test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		RandomAccessFile yswj=new RandomAccessFile("d:\\ewn.jpg","rw");
		RandomAccessFile mbwj=new RandomAccessFile("d:\\ewn1.jpg","rw");
		FileChannel finc=yswj.getChannel();
		FileChannel foutc=mbwj.getChannel();
		long wjdx=finc.transferTo(0,finc.size(),foutc);
		if(wjdx>0) {
			System.out.println();
		}
		yswj.close();
		mbwj.close();
		finc.close();
		foutc.close();
	}
	
}
