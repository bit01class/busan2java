package com.bit;

import java.util.*;
import java.util.Map.Entry;

public class Ex01 {

	public static void main(String[] args) {
		// map - key:val쌍으로 
		Map map=new TreeMap();
		map.put("key1","key1");
		map.put("key2",1234);
		map.put("key3",'a');
		map.put("key4",true);
		map.put("key5",null);
		
		System.out.println("size:"+map.size());
		
		Collection list = map.values();
		Iterator ite=list.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
//		Set entrys=map.entrySet();
//		Iterator ite=entrys.iterator();
//		while(ite.hasNext()) {
//			java.util.Map.Entry entry;
//			entry=(Entry) ite.next();
//			System.out.println(entry.getKey()
//					+":"+entry.getValue());
//		}

//		Set keys=map.keySet();
//		Iterator ite=keys.iterator();
//		while(ite.hasNext()) {
//			Object key=ite.next();
//			System.out.print(key);
//			System.out.print(":");
//			System.out.println(map.get(key));
//		}
	}

}
