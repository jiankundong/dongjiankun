package com.Thread;

import java.util.concurrent.*;

class MyThread3 implements Callable<Object>{
	
	
	public Object call() throws Exception {
		int i=0;
		while (i++<15) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");	
		}
		return i;
	}
}
public class Thread_Test3 {

	public static void main(String[] args) throws Exception, ExecutionException {
		// TODO 自动生成的方法存根
		MyThread3 myThread3=new MyThread3();
		FutureTask<Object>ft1=new FutureTask<>(myThread3);
		Thread thread1=new Thread(ft1,"thread1");
		thread1.start();
		FutureTask<Object>ft2=new FutureTask<>(myThread3);
		Thread thread2=new Thread(ft2,"thread2");
		thread2.start();
		new Thread(new FutureTask<Object>(new MyThread3()),"thread3").start();
		System.out.println("thread1返回结果"+ft1.get());
		System.out.println("thread2返回结果"+ft2.get());
	}

}
