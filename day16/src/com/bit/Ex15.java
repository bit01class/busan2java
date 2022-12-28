package com.bit;

import java.io.*;

public class Ex15 {

	public static void main(String[] args) {
		File file=new File("Lec01.txt");
		try {
			File file2=file.createTempFile("abcdefg", ".txt");
			System.out.println(file2.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
