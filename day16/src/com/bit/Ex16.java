package com.bit;

import java.io.*;

public class Ex16 {

	public static void main(String[] args) {
		String msg="한";
		byte[] arr=msg.getBytes();
		File f=new File("Lec16.bin");
		OutputStream os;
		try {
			if(!f.exists())f.createNewFile();
			os=new FileOutputStream(f);
			os.write('a');
			os.write('b');
			os.write('c');
			os.write('d');
			os.close();
			System.out.println("작성완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
