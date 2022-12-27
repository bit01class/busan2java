package com.bit;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Ex15 {

	public static void main(String[] args) {
		Properties props;
//		props=new Properties();
		props=System.getProperties();
		
//		props.setProperty("key1", "val1");
		
//		System.out.println(props);
		Set set=props.keySet();
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			Object obj=ite.next();
			System.out.println(obj+"@"+props.get(obj));
		}
	}

}







