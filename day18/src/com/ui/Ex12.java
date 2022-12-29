package com.ui;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex12 extends Frame
			implements ItemListener{
	
	public Ex12() {
		Panel p=new Panel();
		Choice tf=new Choice();
		tf.addItem("item1");
		tf.addItem("item2");
		tf.addItem("item3");
		tf.addItem("item4");
		tf.addItemListener(this);
		p.add(tf);
		add(p);
		setBounds(500,100,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex12 me=new Ex12();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice cho=(Choice) e.getSource();
		System.out.println(cho.getSelectedIndex());
		System.out.println(cho.getSelectedItem());
	}



}
