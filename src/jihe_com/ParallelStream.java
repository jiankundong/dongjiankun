package jihe_com;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class ParallelStream {
	public static void main(String[] args) {
		List<String>list=Arrays.asList("C","Z","B","K");
		Stream<String> liu1=list.parallelStream();
		if(liu1.isParallel()) {
			System.out.println("liu1是一个并行流");
		}
		Stream<String>liu2=list.stream();
		if(!liu2.isParallel()) {
			System.out.println("liu2是一个串行流");
		}
		Stream<String>liu3=liu2.parallel();
		if(liu3.isParallel()) {
			System.out.println("liu3是一个并行流");
		}
	}
}