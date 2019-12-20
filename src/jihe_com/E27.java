package jihe_com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class E27 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			int[]arr= {9,8,3,5,2};
			System.out.print("排序前：");
			printArray(arr);
			Arrays.sort(arr);
			System.out.print("排序后：");
			printArray(arr);
			int index=Arrays.binarySearch(arr,3);
			System.out.print("元素3的索引是："+index);
			int []copied=Arrays.copyOfRange(arr,1,7);
			for(int i=0;i<copied.length;i++) {
				System.out.print(copied[i]+"\n");
			}
			Arrays.fill(arr, 8);
			for(int i=0; i<arr.length;i++) {
				System.out.println(i+":"+arr[i]);
			}
	}

	public static void printArray(int[] arr) {
		// TODO 自动生成的方法存根
		System.out.print("[");
		for (int x=0; x<arr.length;x++) {
			if (x!=arr.length-1) {
				System.out.print(arr[x]+",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
	}

}
