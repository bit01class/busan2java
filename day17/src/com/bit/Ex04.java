package com.bit;
import java.io.*;
public class Ex04 {

	public static void main(String[] args) {
		File f=new File("lec03.bin");

		InputStream is=null;
		BufferedInputStream bis=null;
		try {
			if(f.exists()) {
				is=new FileInputStream(f);
				bis=new BufferedInputStream(is);
				while(true) {
					int su=bis.read();
					if(su==-1)break;
					System.out.print((char)su);
				}
			}
			if(bis!=null)bis.close();
			if(is!=null)is.close();
//			System.out.println("끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
