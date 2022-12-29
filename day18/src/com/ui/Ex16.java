package com.ui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ex16 extends JFrame{
	
	public Ex16() {
//		WindowAdapter eve=new WindowAdapter(){
//			@Override
//			public void windowClosing(WindowEvent e) {
//				dispose();
//			}
//		};
//		addWindowListener(eve);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100-1920,100,100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex16 me=new Ex16();

	}

}
