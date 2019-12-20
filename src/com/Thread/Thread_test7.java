package com.Thread;
class DamonThread implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			System.out.println(Thread.currentThread().getName()+"---在运行");
			
		}
	}
	
}
public class Thread_test7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		if (!Thread.currentThread().isDaemon()) {
			System.out.println("main线程是后台线程");
		}
		DamonThread dt=new DamonThread();
		Thread t=new  Thread(dt,"后台线程");
		t.setDaemon(true);
		t.start();
		if(t.isDaemon()) {
			System.out.println("thread线程是后台线程");
		}
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}

}
