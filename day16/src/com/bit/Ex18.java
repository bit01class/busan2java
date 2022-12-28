package com.bit;

import java.io.*;

public class Ex18 {

	public static void main(String[] args) {
		//109,178 바이트
		File target=new File("test11.jpg");
		//109,180 바이트
		File result=new File("copy.jpg");
		byte[] buf=new byte[10];
		InputStream is;
		OutputStream os;
		
			try {
				if(!result.exists())
					result.createNewFile();
				is=new FileInputStream(target);
				os=new FileOutputStream(result);
				while(true) {
					int su=is.read(buf);
					if(su==-1)break;
					os.write(buf);
				}
				os.close();
				is.close();
				System.out.println("복사완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}







