package com.ui;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex07 extends Frame implements WindowListener {
	
	public Ex07() {
		addWindowListener(this);
		setBounds(700-1920,100,100,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex07 me=new Ex07();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â����");
	}
 
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("�ݱ��ư");
		dispose();
//		System.exit(0);
		}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("call disposed");
		}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ");
		}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("���ּ�ȭ");
		}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ȱ��ȭ");
		}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("��Ȱ��ȭ");
		}

}
