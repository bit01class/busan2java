package com.ui;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex13 extends Frame
			implements FocusListener,TextListener{
	
	public Ex13() {
		Panel p=new Panel();
		TextField[] arr=new TextField[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=new TextField(10);
			arr[i].addFocusListener(this);
			arr[i].addTextListener(this);
			p.add(arr[i]);
		}
		add(p);
		setBounds(500-1920,100,300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex13 me=new Ex13();
	}

	@Override
	public void focusGained(FocusEvent e) {
		TextField tf=(TextField) e.getSource();
		System.out.println(tf.getText()+"포커스 얻고");
	}

	@Override
	public void focusLost(FocusEvent e) {
		TextField tf=(TextField) e.getSource();
		System.out.println(tf.getText()+"로커스 잃고");
	}

	@Override
	public void textValueChanged(TextEvent e) {
		TextField tf=(TextField) e.getSource();
		if(tf.getText().length()==4) {
			tf.nextFocus();
		}
		
	}

}
