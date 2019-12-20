package jihe_com;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap_test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map<String,String> hm=new TreeMap<String,String>(new CustomComparator());
		hm.put("1","Amiee");
		hm.put("2","John");
		hm.put("3","Smith");
		hm.put("4","Luch");
		hm.put("5","Amanda");
		System.out.println(hm);
		Set jianji=hm.keySet();
		Iterator diedai=jianji.iterator();
		while (diedai.hasNext()){
			Object key=(Object) diedai.next();
			Object value=hm.get(key);
			System.out.println(key+":"+value);
			
		}
	}

}
