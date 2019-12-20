package jihe_com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E22 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO 自动生成的方法存根
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\test.properties"));
		//通过lambda
		sxj.forEach((key,value)->System.out.println(key+":"+value));
		FileOutputStream out=new FileOutputStream("d:0\\test.properties");
		sxj.setProperty("charset","UTF-8");
		//store:存储文件
		sxj.store(out,"");
	}

}
