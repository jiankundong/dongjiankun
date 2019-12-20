package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		FileInputStream fin=new FileInputStream("d:\\src.jpg");
		FileOutputStream fout=new FileOutputStream("d:\\1.jpg");
		long kssj=System.currentTimeMillis();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
			//System.out.println(b);
			fout.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		long jssj=System.currentTimeMillis();
		System.out.println("拷贝这张图片花费"+(jssj-kssj)+"毫秒");
		//String string=",come on";
		//fout.write(string.getBytes("UTF-8"));
		fin.close();
		fout.close();
	}

}
