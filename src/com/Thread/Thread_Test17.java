package com.Thread;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
public class Thread_Test17 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO 自动生成的方法存根
			CompletableFuture<Integer>completableFuture=CompletableFuture.supplyAsync(()->{
				int sum=0,i=0;
				while(i++<5) {
					sum+=i;
					System.out.println(Thread.currentThread().getName()+"线程任务正在执行"+i);
				}
				return sum;
			});
			CompletableFuture<Integer>completableFuture2=CompletableFuture.supplyAsync(()->{
				int sum=0,i=5;
				while(i++<10) {
					sum+=i;
					System.out.println(Thread.currentThread().getName()+"线程任务正在执行"+i);
				}
				return sum;
			});
			CompletableFuture<Integer>completableFuture3=CompletableFuture.supplyAsync(()->{
				int sum=0,i=10;
				while(i++<20) {
					sum+=i;
					System.out.println(Thread.currentThread().getName()+"线程任务正在执行"+i);
				}
				return sum;
			});
			//CompletableFuture<Integer>completableFuture3=completableFuture.thenCombine(completableFuture2, (resule1,resule2)->resule1+resule2);
			int a=completableFuture2.get()+completableFuture.get()+completableFuture3.get();
			//System.out.println("1到10相加的结果为："+completableFuture3.get());
			System.out.println("1到20相加的结果为："+a);
	}

}
