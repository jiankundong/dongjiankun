package com.string;

public class Test_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			StringBuffer s=new StringBuffer("Helloworld");
			String dglzfc=s.reverse().toString();
			System.out.println(dglzfc);
			StringBuffer kc=new StringBuffer();
			char[] zfsz=dglzfc.toCharArray();
			for(int i=0; i<zfsz.length;i++) {
				char c=zfsz[i];
				if (Character.isUpperCase(c)) {
					String dxbxx=(""+c).toLowerCase();
					kc.append(dxbxx);
				}else  if (Character.isLowerCase(c)) {
					String dxbxx=(""+c).toUpperCase();
					kc.append(dxbxx);
				}
					
		}
			System.out.println(kc);
	}
}


