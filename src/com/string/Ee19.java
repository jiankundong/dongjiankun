package com.string;

import java.sql.RowIdLifetime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Ee19 {

	public static void main(String[] args) throws ParseException {
		// TODO 自动生成的方法存根
			Date date1=new Date();
			Date date2=new Date(System.currentTimeMillis()+1000);
			System.out.println(date1);
			System.out.println(date2);
			SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日HH时mm分ss秒E");
			System.out.println(sdf.format(date1));
			
			
			Calendar calendar=Calendar.getInstance();
			int nian=calendar.get(Calendar.YEAR);
			int yue=calendar.get(Calendar.MONTH)+1;
			int ri=calendar.get(Calendar.DATE);
			System.out.println(nian+"年"+yue+"月"+ri+"日");
			/*calendar.set(Calendar.MONTH, 13);
			System.out.println(calendar.getTime());
			calendar.setLenient(false);
			calendar.set(Calendar.MONTH, 13);
			System.out.println(calendar.getTime());*/
			
			
			LocalDate dqrq=LocalDate.now();
			LocalDate D_100=dqrq.plusDays(100);
			System.out.println(D_100);
			System.out.println("100天以后"+dqrq.plusDays(100));
			
			SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
			//将LocalDate对象的值改成String类的对象用toString方法
			String ybtyh_zfc=D_100.toString();
			//先通过SimpleDateFormat对一百天以后的Date对象进行格式化，用format方法
			Date date_100=sdf1.parse(ybtyh_zfc);
			//再通过SimpleDateFormat对一百天以后的Date对象进行格式化，用format方法
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年M月dd日");
			System.out.println("100天以后是"+sdf2.format(date_100));
			
			SimpleDateFormat sdf3=new SimpleDateFormat("yyyy/MM/dd");
			String rqzfc="2018/01/27";
			Date date3=sdf3.parse(rqzfc);
			System.out.println(date3.toString());
			SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日");
			System.out.println(sdf4.format(date3));
			
			
			
			
			String str1=new String("abc");
			String str2=new String("abc");
			System.out.println(str1==str2);
			System.out.println(str1.equals(str2));
			String str3=new String("abc");
			String str4=new String("abc");
			System.out.println(str3==str4);
			System.out.println(str1.equals(str4));
			
			
			
	}

}
