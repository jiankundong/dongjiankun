package com.Thread;
class TicketWindow extends Thread{
	private int  tickets=100;
	
		public void run() {
		
			while (true) {
				if(tickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
			}
		}
	}
} 
public class Thread_Test4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			new TicketWindow().start();
			new TicketWindow().start();
			new TicketWindow().start();
			new TicketWindow().start();
	}

}
