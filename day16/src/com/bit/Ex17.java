package com.bit;

import java.io.*;

public class Ex17 {

	public static void main(String[] args) {
		File f=new File("Lec16.bin");
		InputStream is;
		if(f.exists()) {
			try {
				is=new FileInputStream(f);
				int su=-1;
				while(true) {
					su=is.read();
					if(su==-1)break;
					System.out.println(su);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





