package com.ui;

import java.awt.*;

public class Ex06{

	public static void main(String[] args) throws InterruptedException {
		Frame f=new Frame("�̸�����");
		f.setBounds(100-1920,100,500,500);
		f.setVisible(true);
//		Dialog dia=new Dialog(f);
//		dia.setBounds(200-1920,200,200,200);
//		dia.setVisible(true);

		FileDialog dia2=new FileDialog(f,"�˾�â",FileDialog.SAVE);
		dia2.setTitle("����â");
		dia2.setLocation(100-1920,100);
		dia2.setVisible(true);
		String filename=dia2.getFile();
		String parent=dia2.getDirectory();
		String name=dia2.getName();
		String title=dia2.getTitle();
		System.out.println("���ϴ��̾�α� ȣ��...");
		System.out.println(filename);
		System.out.println(parent);
		System.out.println(name);
		System.out.println(title);
	}

}
