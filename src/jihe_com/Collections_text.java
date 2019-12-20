package jihe_com;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_text {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"C","Z","B","K");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("按自然顺序排序后:"+list);
		Collections.shuffle(list);
		System.out.println("按随机顺序排序后:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("集合首尾元素交换后:"+list);
	}

}
