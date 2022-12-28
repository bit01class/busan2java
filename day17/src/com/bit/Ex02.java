package com.bit;

import java.io.*;
public class Ex02 {

	public static void main(String[] args) {
		File f=new File("target.jpg");
		File copy=new File("copy.jpg");
		byte[] buf=new byte[1];
		InputStream is=null;
		OutputStream os=null;
		try {
			if(f.exists()) {
				is=new FileInputStream(f);
				if(!copy.exists())copy.createNewFile();
				os=new FileOutputStream(copy);
				while(true) {
					int su=is.read(buf);
					if(su==-1)break;
					os.write(buf,0,su);
				}
			}
			if(os!=null)os.close();
			if(is!=null)is.close();
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
