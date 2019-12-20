package com.Thread;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifeAndFork=new Object();
	
	private boolean flag;
	public DeadLockThread(boolean flag) {
		// TODO 自动生成的构造函数存根
		this.flag=flag;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if (flag) {
		while(true) {
			synchronized (chopsticks) {
				System.out.println(Thread.currentThread().getName()+"---if---chopsticks");
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
				}
			}
		}
	}else {
		while(true) {
			synchronized (knifeAndFork) {
				System.out.println(Thread.currentThread().getName()+"---else---knifeAndFork");
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---else---chopsticks");
				}
			}
		}
	}		
  }
}
public class Thread_Test14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			DeadLockThread thread1=new DeadLockThread(true);
			DeadLockThread thread2=new DeadLockThread(false);
			new Thread(thread1,"Chinese").start();
			new Thread(thread2,"American").start();
	}

}
