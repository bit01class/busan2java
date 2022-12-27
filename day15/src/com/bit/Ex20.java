package com.bit;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ex20 {

	public static void main(String[] args) {
		// 100일 계산기
		// 년>2022
		// 월>12
		// 일>26
		// 0000-01-01에서 100일 뒤는 0000-00-00입니다
		Date d=new Date(2022-1900,12-1,26);
		long before=d.getTime();
		before+=1000L*60L*60L*24L*100L;
		Date d2=new Date(before);
		System.out.println(d);
		System.out.println(d2);
		Calendar cal=new GregorianCalendar(2022,12-1,26);
		cal.add(Calendar.DATE, 100);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		Date d3=cal.getTime();
	}

}
