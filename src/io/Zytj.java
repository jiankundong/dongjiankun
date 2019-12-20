package io;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Zytj {
	  static HashMap<String,Integer> hm=new HashMap<>();
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
	
		FileInputStream fin=new FileInputStream("18rj1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String  xsm=br.readLine();
		while (xsm!=null) {
			hm.put(xsm,0);
			xsm=br.readLine();
		}
		File file=new File("D:\\18软件1班作业");
		FileDir(file);
		System.out.println(hm);
		}
	private static void FileDir(File file) {
		// TODO 自动生成的方法存根
		File[]files=file.listFiles();
		//当前文件夹下面的每一个文件f
		for(File f : files) {
			//如果是目录名
			if (f.isDirectory()) {
				
				String  wjm=f.getName();
				hm.forEach((xsm,cs)->{
					if(wjm.contains(xsm)) {
						cs=cs+1;
						hm.put(xsm,cs);
					}
				});
				FileDir(f);
			}
			
		}
	}




}
