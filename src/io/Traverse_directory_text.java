package io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;
import java.util.jar.Attributes.Name;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class Traverse_directory_text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File file=new File("E:\\java");
		/*if (file.isDirectory()) {
			String[] fileNames=file.list((dir,Name)->Name.endsWith(".pdf"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}*/
		FileDir(file);
	}

	private static void FileDir(File file) {
		// TODO 自动生成的方法存根
		File[]files=file.listFiles();
		//当前文件夹下面的每一个文件f
		for(File f : files) {
			//如果是目录名
			if (f.isDirectory()) {
				System.out.println(f);
				//递归调用
				FileDir(f);
			}
			else
				//输出文件名
				System.out.println(f);
		}
	}

}
