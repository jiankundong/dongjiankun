package jihe_com;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		return s1.length()-s2.length();
	}	
}
public class TreeSet_text3 {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>(new MyComparator());
		//如果使用TreeSet默认的比较器插入字符串，则会使用字符串类的CompareTo方法
		//按照英文字母或者数字的顺序进行排序插入集合
		//如果使用自定义的比较器Mycomparator插入字符串，则会使用自定义的比较器类的Compare方法
		//按照字符长度的顺序进行排序插入集合，如果长度的相同，则TreeSet认为是同一个元素，无法插入
		ts.add("马群群");
		ts.add("冯波");
		System.out.println(ts);
	}

}
