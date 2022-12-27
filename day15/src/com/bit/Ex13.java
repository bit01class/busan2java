package com.bit;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex13 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		DateFormat df=DateFormat.getDateTimeInstance();
		String msg=df.format(d);
		System.out.println(msg);
	}

}




