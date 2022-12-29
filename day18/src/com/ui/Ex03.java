package com.ui;

import java.awt.*;

import javax.swing.JLabel;

public class Ex03 extends Frame{
	
	public Ex03() {
		Panel p=new Panel();
		
		Label la=new Label("AaBb");
		Font f=new Font("Monospaced Serif Arial",Font.BOLD,30);
		la.setFont(f);
		Color fcolor=Color.MAGENTA;
		Color bcolor=new Color(0,0,255);
		la.setForeground(fcolor);
		p.setBackground(bcolor);
		p.add(la);
		TextField tf=new TextField(10);
		tf.setFont(f);
		p.add(tf);
		Button btn=new Button("버튼");
		p.add(btn);
//		tf.setVisible(false);
//		tf.setEnabled(false);
		tf.setEditable(false);
		add(p);
		setBounds(100-1920,100,400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex03();

	}

}
