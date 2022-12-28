package com.bit;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) {
		String msg="abcdefg hijklmn";
		File f=new File("lec01.bin");
		OutputStream os;
		
		try {
			if(!f.exists())f.createNewFile();
			os=new FileOutputStream(f);
			
			for(int i=0; i<msg.length(); i++) {
				os.write(msg.charAt(i));
			}
			os.close();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







