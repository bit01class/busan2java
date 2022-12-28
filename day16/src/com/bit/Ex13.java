package com.bit;

import java.io.*;

public class Ex13 {

	public static void main(String[] args) {
		File f=new File("test02");
		if(f.exists()) {
			boolean boo=f.delete();
			
			if(boo)System.out.println("삭제완료");
			else {
				System.out.println("하위도 모두 지우시겠습니까?Y");
				File[] arr=f.listFiles();
				for(int i=0; i<arr.length; i++) {
					arr[i].delete();
				}
				f.delete();
				System.out.println("삭제완료");
			}
		}else {
			System.out.println("파일없음");
		}
	}

}
