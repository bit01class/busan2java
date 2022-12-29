package com.ui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex08 extends Frame 
			implements MouseListener{
	
	public Ex08() {
		Panel p=new Panel();
		
		Button btn=new Button("��ư");
		
		btn.addMouseListener(this);
		
		p.add(btn);
		add(p);
		setBounds(600-1920,100,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex08 me=new Ex08();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x=e.getX();
		int y=e.getY();
		
		System.out.println(x+"Ŭ��"+y);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("����");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("[���Ⱦ��µ�]�ö��");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("������Ʈ ���� �ö��");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("��������");
	}

}
