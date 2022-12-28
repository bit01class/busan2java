package com.bit;
import java.io.*;
public class Ex05 {

	public static void main(String[] args) {
		File target=new File("target.jpg");
		File copy=new File("copy.jpg");
		
		byte[] buf=new byte[2];
		
		InputStream is=null;
		OutputStream os=null;
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		try {
			if(!copy.exists())copy.createNewFile();
			is=new FileInputStream(target);
			os=new FileOutputStream(copy);
			
			bis=new BufferedInputStream(is);
			bos=new BufferedOutputStream(os);

			while(true) {
				int su=bis.read(buf);
				if(su==-1)break;
				bos.write(buf,0,su);
			}
			
			if(bos!=null)bos.close();
			if(bis!=null)bis.close();
			if(os!=null)os.close();
			if(is!=null)is.close();
			System.out.println("copy seccess...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







