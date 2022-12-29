package com.ui;

import java.awt.*;

public class Ex06{

	public static void main(String[] args) throws InterruptedException {
		Frame f=new Frame("이름없음");
		f.setBounds(100-1920,100,500,500);
		f.setVisible(true);
//		Dialog dia=new Dialog(f);
//		dia.setBounds(200-1920,200,200,200);
//		dia.setVisible(true);

		FileDialog dia2=new FileDialog(f,"팝업창",FileDialog.SAVE);
		dia2.setTitle("열기창");
		dia2.setLocation(100-1920,100);
		dia2.setVisible(true);
		String filename=dia2.getFile();
		String parent=dia2.getDirectory();
		String name=dia2.getName();
		String title=dia2.getTitle();
		System.out.println("파일다이얼로그 호출...");
		System.out.println(filename);
		System.out.println(parent);
		System.out.println(name);
		System.out.println(title);
	}

}
