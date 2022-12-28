package com.bit;

import java.io.*;

public class Ex21 {

	public static void main(String[] args) {
		String msg="abcdefg hijklmn";
		byte[] arr=msg.getBytes();
		File f=new File("Lec21.txt");
		OutputStream os;
			try {
				if(f.exists())
					f.createNewFile();
				os=new FileOutputStream(f);
				
				os.write(arr);
				
				os.close();
				System.out.println("한번에 작성");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}






