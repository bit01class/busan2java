package com.bit;

import java.io.*;

public class Ex14 {

	public static void main(String[] args) {
		File f=new File(".\\test02\\ex01");
		if(f.exists()) {
			System.out.println("존재함");
		}else {
			boolean boo=f.mkdirs();
			if(boo)System.out.println("생성");
		}
	}

}
