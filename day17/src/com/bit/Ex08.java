package com.bit;
import java.io.*;
public class Ex08 {

	public static void main(String[] args) {
//		PrintStream out=System.out;
		File f=new File("lec06.bin");
		OutputStream os=null;
		PrintStream ps=null;
		try {
			os=new FileOutputStream(f);
			ps=new PrintStream(os);
			
			ps.write(12);
			ps.print(4321);
			ps.print(4.14);
			ps.print('한');
			ps.print(false);
//			ps.w("abcdefg");
			
			if(ps!=null)ps.close();
			if(os!=null)os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
