package jihe_com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class dedai {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
   ArrayList<String> list=new ArrayList<String>();
   list.add("data_1");
   list.add("data_2");
   list.add("data_3");
   list.add("data_4");
   Iterator iterator=list.iterator();
   while (iterator.hasNext()) {
	Object object=iterator.next();
	System.out.print(object+" ");
	
	
}
   for (Object object :list) {
	System.out.print(object+" ");
	
}
	}

}
