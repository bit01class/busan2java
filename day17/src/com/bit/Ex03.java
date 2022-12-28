package com.bit;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) {
		String msg="ABCDEFG HIJKLMN";
		File f=new File("lec03.bin");
		OutputStream os=null;
		BufferedOutputStream bos=null;
		try {
			if(!f.exists())f.createNewFile();
			os=new FileOutputStream(f);
			bos=new BufferedOutputStream(os);
			for(int i=0; i<msg.length(); i++) {
				bos.write(msg.charAt(i));
			}
			if(bos!=null)bos.close();
			if(os!=null)os.close();
			System.out.println("끝");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
