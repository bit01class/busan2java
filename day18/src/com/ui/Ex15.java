package com.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex15 extends Frame
				implements ActionListener{
	
	public Ex15() {
		MenuBar mb=new MenuBar();
		Menu m=new Menu("메뉴");
		MenuItem mi1=new MenuItem("메뉴1");
		m.add(mi1);
		MenuItem mi2=new MenuItem("메뉴2");
		m.add(mi2);
		m.add("메뉴3");
		mb.add(m);
		setMenuBar(mb);
		Panel p=new Panel();
		Label la=new Label("label");
		Button btn=new Button("btn");
		TextField tf=new TextField(10);
		TextArea ta=new TextArea();
		Choice cho=new Choice();
		cho.addItem("cho1");
		cho.addItem("cho2");
		cho.addItem("cho3");
		List list=new List();
		list.addItem("list1");
		list.addItem("list2");
		list.addItem("list3");
		Checkbox cb1=new Checkbox("chk1");
		Checkbox cb2=new Checkbox("chk2");
		Checkbox cb3=new Checkbox("chk3");
		p.add(la);
		p.add(btn);
		p.add(tf);
		p.add(ta);
		p.add(cho);
		p.add(list);
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		
		mi1.addActionListener(this);
		
		add(p);
		setBounds(500-1920,100,300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex15 me=new Ex15();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("action..");
	}

}
