package com.string;

import java.util.HashSet;
import java.util.Random;
public class Ssq {
	public static void main(String[] args) throws InterruptedException {
	System.out.println("双色球开奖结果：");
	System.out.println("六个红球号码是：");
	Random r=new Random();
	HashSet<Integer>hs=new HashSet<>();
	for(int i=0; i<10000; i++) {
		int  hq=r.nextInt(33)+1;
		if (hs.size()==6) {
			break;
		}
	    hs.add(hq);
	}
	for(Integer hq:hs) {
		System.out.print(hq+" ");
		Thread.sleep(1000);
	}
	System.out.println("蓝球号码是：");
	Random r1=new Random();
	int lq=r1.nextInt(16)+1;
		System.out.print(lq+" ");
		Thread.sleep(1000);
	
	}
}
