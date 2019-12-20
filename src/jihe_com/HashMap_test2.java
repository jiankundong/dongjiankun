package jihe_com;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class CustomComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO 自动生成的方法存根
		String key1=(String)o1;
		String key2=(String)o2;
		return key2.compareTo(key1);
	}
	
}
public class HashMap_test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map <String,String>map=new TreeMap<String,String>(new CustomComparator());
		map.put("1","jack");
		map.put("2","Rose");
		map.put("3","Luck");
		map.put("1","jacky");
		System.out.println(map);
	}

}
