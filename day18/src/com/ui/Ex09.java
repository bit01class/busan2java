package com.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex09 extends Frame
			implements MouseMotionListener{
	Label la;
	public Ex09() {
		Panel p=new Panel();
		p.setLayout(null);
		p.addMouseMotionListener(this);
		la=new Label("★");
		la.setSize(35, 35);
		la.setLocation(100,100);
		p.add(la);
		add(p);
		setBounds(600-1920,100,400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex09 me=new Ex09();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x=e.getX();//기준 이벤트객체
		int y=e.getY();

//		int x=e.getXOnScreen();//기준 화면
//		int y=e.getYOnScreen();
		System.out.println("드레그 x="+x+",y="+y);
		la.setLocation(x,y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
//		System.out.println("움직");
	}

}
