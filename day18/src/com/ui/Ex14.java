package com.ui;

import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ex14 extends Frame
				implements ContainerListener,MouseListener{
	Panel p=new Panel();
	Button btn=new Button("추가");
	
	public Ex14() {
		p.addContainerListener(this);
		btn.addMouseListener(this);
		p.add(btn);
		add(p);
		setBounds(500-1920,100,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex14 me=new Ex14();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Label la=new Label("추가");
		la.addMouseListener(this);
		p.add(la);
//		validate();//검사
//		revalidate();//재검사
//		repaint();//다시그림
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()!=btn) {
			Label la=(Label) e.getSource();
			la.setVisible(false);
//			validate();
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentAdded(ContainerEvent e) {
		System.out.println("추가됨");
		validate();
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		// TODO Auto-generated method stub
		
	}

}
