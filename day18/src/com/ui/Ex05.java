package com.ui;

import java.awt.*;

public class Ex05 extends Frame{
	
	public Ex05() {
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("메뉴1");
		m1.add("1-1");
		m1.add("1-2");
		m1.add("1-3");
		mb.add(m1);
		Menu m2=new Menu("메뉴2");
		MenuItem mi1=new MenuItem("2-1");
		m2.add(mi1);
		Menu mi2=new Menu("2-2");
		MenuItem mi2_1=new MenuItem("2-2-1");
		mi2.add(mi2_1);
		m2.add(mi2);
		Menu mi3=new Menu("2-3");
		CheckboxMenuItem ck1=new CheckboxMenuItem("2-3-1");
		mi3.add(ck1);
		m2.add(mi3);
		mb.add(m2);
		Menu m3=new Menu("메뉴3");
		mb.add(m3);
		setMenuBar(mb);
		
		setBounds(100-1920,100,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex05();
	}

}
