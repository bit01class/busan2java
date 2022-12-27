package com.bit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex14 {

	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf;
		sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		String msg=sdf.format(d);
		System.out.println(msg);
	}

}
