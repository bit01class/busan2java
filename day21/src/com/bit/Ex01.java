package com.bit;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex01 extends Frame implements Runnable, ActionListener{
	Label nla2, sla;
	JButton[] btns;
	Button startBtn;
	Panel pc;
	int cnt;
	public Ex01() {
		setLayout(new BorderLayout());
		Panel pn=new Panel();
		Label nla1=new Label("농구공을 찾아라~~");
		nla2=new Label("60s");
		pn.add(nla1);
		pn.add(nla2);
		Panel ps=new Panel();
		sla=new Label("Num:0");
		ps.add(sla);
		pc=new Panel(new GridLayout(4,4));
		btns=new JButton[4*4];
		for(int i=0; i<btns.length; i++) {
			btns[i]=new JButton();
			ImageIcon defaultIcon=null;
			if(i%4==0) {
				defaultIcon=new ImageIcon("1.jpg");
				btns[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cnt++;
						sla.setText("Num:"+cnt);
					}
				});
			}else if(i%4==1) {
				defaultIcon=new ImageIcon("2.jpg");
			}else if(i%4==2) {
				defaultIcon=new ImageIcon("3.jpg");
			}else{
				defaultIcon=new ImageIcon("4.jpg");
			}
			btns[i].setIcon(defaultIcon);
		}
		for(int i=0; i<btns.length; i++) {
			btns[i].setEnabled(false);
		}
		mix();
		
		Panel pe=new Panel(new GridLayout(5,1));
		startBtn=new Button("START");
		Button endBtn=new Button("END");
		startBtn.addActionListener(this);
		endBtn.addActionListener(this);
		pe.add(new Label());
		pe.add(startBtn);
		pe.add(new Label());
		pe.add(endBtn);
		pe.add(new Label());
		add(pn,BorderLayout.NORTH);
		add(ps,BorderLayout.SOUTH);
		add(pc,BorderLayout.CENTER);
		add(pe,BorderLayout.EAST);
		setBounds(100-1920,100,450,450);
		setVisible(true);
	}

	public static void main(String[] args) {
		// 225*225
		Ex01 me =new Ex01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn=(Button) e.getSource();
		if(btn.getLabel().equals("START")) {
			Thread thr=new Thread(this);
			thr.start();
		}else if(btn.getLabel().equals("END")) {
			dispose();
		}
		
	}
	
	public void editBtns(boolean boo) {
		for(int i=0; i<btns.length; i++) {
			btns[i].setEnabled(boo);
		}
	}
	
	public void mix() {
		Random random=new Random();
		for(int i=0; i<32; i++) {
			int ran1=random.nextInt(16);
			int ran2=random.nextInt(16);
			JButton temp=btns[ran1];
			btns[ran1]=btns[ran2];
			btns[ran2]=temp;
		}
		for(int i=0; i<btns.length; i++) {
			pc.add(btns[i]);
		}
//		repaint();
//		validate();
		revalidate();
	}

	@Override
	public void run() {
		int time=10;
		while(time>=0) {
			mix();
			startBtn.setEnabled(false);
			nla2.setText(time+"s");
			editBtns(true);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time--;
		}
		startBtn.setEnabled(true);
		editBtns(false);
	}

}
