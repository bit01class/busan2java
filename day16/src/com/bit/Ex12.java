package com.bit;

import java.io.*;

public class Ex12 {

	public static void main(String[] args) {
		File f=new File(".\\test02\\ex02.txt");
		if(f.exists()) {
			System.out.println("존재합니다");
		}else {
			try {
				boolean boo=f.createNewFile();
				if(boo) System.out.println("파일생성");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
