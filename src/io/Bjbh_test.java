package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh_test {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Path wj=Paths.get("d://tice//班级信息.txt");
		Path wj2=Paths.get("d://tice//求班级编号.txt");
		Path wj3=Paths.get("d://tice//班级编号.txt");
		Files.createFile(wj3);
		List list=new ArrayList<>();
		List <String> lines=Files.readAllLines(wj);
		List <String> lines2=Files.readAllLines(wj2);
		//System.out.println("文件中的内容是");
		//lines.forEach(x->System.out.println(x));
		Map<String, String>map=new HashMap<>();
		for(String line : lines) {
			String[] zfcsz=line.split("	");
			map.put(zfcsz[1],zfcsz[0]);
		}
		System.out.println(lines2);
		for(String line2 : lines2) {
			list.add(map.get(line2));
		}
		System.out.println(list);
		Files.write(wj3,list,StandardOpenOption.APPEND);
	}

}
