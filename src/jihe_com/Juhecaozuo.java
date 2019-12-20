package jihe_com;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Juhecaozuo {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<String>list =new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("张小明");
		list.add("张阳");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(3).skip(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=======");
		list.stream().filter(i->i.startsWith("张")&&i.length()>2).limit(3).skip(2).forEach(j->System.out.println(j));
		List <String> xlb=list.stream().filter(i->i.startsWith("张")).collect(Collectors.toList());
		System.out.println(xlb);
		 String string=list.stream().filter(i->i.startsWith("张")).collect(Collectors.joining("and"));
		List<String> string1=list.stream().filter(i->i.startsWith("张")).collect(Collectors.toList());
		System.out.println(string1);
	}
}
