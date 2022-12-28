package com.ui;

import java.awt.*;

public class Ex04 extends Frame{
	
	public Ex04() {
		LayoutManager lm=new GridBagLayout();
		GridBagConstraints gbc;
		gbc=new GridBagConstraints();
		setLayout(lm);
		
		gbc.fill=GridBagConstraints.BOTH;
		
		Button btn1=new Button();
		btn1.setLabel("btn1");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn1,gbc);
		
		Button btn2=new Button();
		btn2.setLabel("btn2");
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn2,gbc);
		Button btn3=new Button();
		btn3.setLabel("btn3");
		gbc.gridx=2;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn3,gbc);
		Button btn4=new Button();
		btn4.setLabel("btn4");
		gbc.gridx=3;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn4,gbc);
		Button btn5=new Button();
		btn5.setLabel("btn5");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn5,gbc);
		Button btn6=new Button();
		btn6.setLabel("btn6");
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=2;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn6,gbc);
		Button btn7=new Button();
		btn7.setLabel("btn7");
		gbc.gridx=3;
		gbc.gridy=1;
		gbc.gridwidth=1;
		gbc.gridheight=2;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn7,gbc);
		Button btn8=new Button();
		btn8.setLabel("btn8");
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn8,gbc);
		Button btn9=new Button();
		btn9.setLabel("btn9");
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn9,gbc);
		Button btn10=new Button();
		btn10.setLabel("btn10");
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		add(btn10,gbc);
		
		setSize(500,400);
		setLocation(200-1920,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04();
	}

}
