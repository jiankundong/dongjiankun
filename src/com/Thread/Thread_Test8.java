package com.Thread;

public class Thread_Test8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Thread t1=new Thread(()->{
			for (int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出"+i);	
			}
		},"优先级较高的线程");
		Thread t2=new Thread(()->{
			for (int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+"正在输出"+i);	
			}
		},"优先级较低的线程");
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for (int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+"正在输出"+i);	
				}
			}
		},"优先级普通的线程");
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();
	}

}
