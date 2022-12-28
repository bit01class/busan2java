package com.bit;

import java.io.*;

public class Ex22 {

	public static void main(String[] args) {

		File f=new File("Lec21.txt");
		byte[] arr=new byte[10];
		InputStream is;
		try {
			is=new FileInputStream(f);
			while(true) {
				int su=is.read(arr);
				if(su==-1)break;
				System.out.println(new String(arr));
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
