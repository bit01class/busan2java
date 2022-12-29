package com.ui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;



public class Ex04 extends Frame{
	static Ex04 me;
	Canvas can=new MyCanvas();
	class MyCanvas extends Canvas{
		//백터
		@Override
		public void paint(Graphics g) {
			char[] arr="한글".toCharArray();
			g.drawChars(arr, 0, arr.length, 100, 100);
			g.drawLine(100, 100, 200, 200);
			g.setColor(Color.RED);
			g.drawRect(200, 200, 100, 100);
			g.setColor(Color.BLUE);
			g.drawOval(300, 300, 100, 100);
//			Toolkit tool=Toolkit.getDefaultToolkit();
//			Image img=tool.createImage("logo.jpg");
//			System.out.println(img.getWidth(me));
			ImageIcon icon = new ImageIcon("D:\\java\\download.png");
	        Image img = icon.getImage();
			g.drawImage(img, 100,100, me);
			g.drawArc(100, 100, 100, 100, 45, 180);
		}
	}	
	public Ex04() {
		add(can);
		setBounds(100-1920,100,500,500);
		setVisible(true);
		repaint();
	}

	public static void main(String[] args) {
		me=new Ex04();

	}

}
