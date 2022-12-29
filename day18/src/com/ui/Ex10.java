package com.ui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex10 extends Frame
			implements KeyListener{
	TextField tf;
	public Ex10() {
//		setLayout(null);
//		la=new Label("★");
//		la.setBounds(100, 30, 35, 35);
		Panel p=new Panel();
		
		tf=new TextField(10);
		tf.addKeyListener(this);
//		Button cho=new Button();
//		p.add(cho);
		p.add(tf);
		add(p);
		setBounds(500-1920,100,300,200);
		setVisible(true);
	}

	public static void main(String[] args) throws InterruptedException {
		Ex10 me=new Ex10();
//		while(true) {
//			Thread.sleep(1000);
//			la.setLocation(la.getX(),la.getY()+10);
//		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char ch=e.getKeyChar();
		int su=e.getKeyCode();
		System.out.println(ch+"눌렸고"+su);
		System.out.println(tf.getText());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char ch=e.getKeyChar();
		int su=e.getKeyCode();
		System.out.println(ch+"누르는 중이고"+su);
		System.out.println(tf.getText());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char ch=e.getKeyChar();
		int su=e.getKeyCode();
		System.out.println(ch+"올라옴"+su);
		System.out.println(tf.getText());
//		int x=la.getX();
//		int y=la.getY();
//		if(su==39) {
//			la.setLocation(x+10,y);
//		}else if(su==37) {
//			la.setLocation(x-10,y);
//		}else if(su==38) {
//			la.setLocation(x,y-10);
//		}else if(su==40) {
//			la.setLocation(x,y+10);
//		}
	}

}
