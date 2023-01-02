package com.bit;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex01 extends Frame implements ActionListener{
	
	public Ex01() {
		setTitle("제목없음");
		TextArea ta=new TextArea();
		MenuBar mb=new MenuBar();
		Menu mn1=new Menu("File");
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Open");
		MenuItem mi3=new MenuItem("Save");
		MenuItem mi4=new MenuItem("Exit");
		MenuItem mi5=new MenuItem("About");
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mi5.addActionListener(this);
		mn1.add(mi1);
		mn1.addSeparator();
		mn1.add(mi2);
		mn1.add(mi3);
		mn1.addSeparator();
		mn1.add(mi4);
		mb.add(mn1);
		
		Menu mn2=new Menu("Help");
		mn2.add(mi5);
		mb.add(mn2);
		setMenuBar(mb);
		add(ta);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setBounds(100-1920,100,500,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		Ex01 me=new Ex01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MenuItem mi=(MenuItem)e.getSource();
		if(mi.getLabel().equals("Exit")) {
			dispose();
		}
		if(mi.getLabel().equals("About")) {
			Dialog dia=new Dialog(this,"About");
			WindowAdapter win=new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					dia.dispose();
				}
			};
			dia.addWindowListener(win);
			dia.setLayout(new GridLayout(3,1));
			Panel p1=new Panel();
			Panel p2=new Panel();
			Panel p3=new Panel();
			Label la=new Label("Welcome");
			la.setFont(new Font(Font.SANS_SERIF,Font.BOLD,26));
			p1.add(la);
			p2.add(new Label("2023-01-02"));
			Button btn=new Button("Close");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					dia.dispose();
				}
			});
			p3.add(btn);
			dia.add(p1);
			dia.add(p2);
			dia.add(p3);
			dia.setBounds(200-1920, 200, 300, 150);
			dia.setVisible(true);
		}
	}

}






