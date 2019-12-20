package jihe_com;
import java.util.ArrayList;
import java.util.Iterator;
import org.omg.CORBA.PUBLIC_MEMBER;
public class Diedai_xuji {
	public static void main(String[] args) {
		ArrayList <String>list =new<String> ArrayList();
		list.add("jack");
		list.add("Annie");
		list.add("Rose");
		list.add("Tom");
		System.out.println("1:lambda表达式便利集合里每个元素");
		list.forEach(duixiang->System.out.print(duixiang+" "));
		System.out.println("\n2:lambda表达式便利集合里每个元素");
		 Iterator it=list.iterator();
		   while (it.hasNext()) {
			Object object=it.next();
			System.out.print(object+" ");
			if("Tom".equals(object)) {
				it.remove();
			}	
		}
		   list.forEach(duixiang->System.out.print(duixiang+" "));
		   System.out.println("\n3:lambda表达式便利集合里每个元素");
		   for (Object object :list) {
				System.out.print(object+" ");		
			}     
	}
}
