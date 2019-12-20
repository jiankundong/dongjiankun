package io;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Files_test {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		Path ml=Paths.get("d://tice//班级信息.txt");
		try {
			Files.createDirectories(ml);
			System.out.println("目录创建成功");
		}catch(IOException e){
			System.out.println("目录创建不成功");
		}
		Path wj=Paths.get("d://tice//求班级编号.txt");
		try {
			Files.createFile(wj);
			System.out.println("文件创建成功");
		}catch(IOException e){
			System.out.println("文件创建不成功");
		}
		List list=new ArrayList<String>();
		list.add("这是一个测试文件");
		try{
			Files.write(wj,list,StandardOpenOption.APPEND);
			System.out.println("文件写入成功");
		}catch(IOException e){
			System.out.println("文件写入不成功");
		}
		List <String> lines=Files.readAllLines(wj);
		System.out.println("文件中的内容是"+lines);
		System.out.println("文件大小是"+Files.size(wj));
	}

}
