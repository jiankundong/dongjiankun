package com.string;

import java.util.*;

public class E09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Properties properties=System.getProperties();
System.out.println(properties);
Set<String>propertyNames=properties.stringPropertyNames();
for(String key : propertyNames) {
	String value=System.getProperty(key);
	System.out.println(key+"---"+value);
}
	}

}
