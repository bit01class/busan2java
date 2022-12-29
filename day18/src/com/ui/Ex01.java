package com.ui;

import java.awt.*;

public class Ex01 extends Frame{
	public Ex01() {
		LayoutManager lm=new BorderLayout();
		setLayout(lm);
		
		Panel p=new Panel();
		p.setLayout(new GridBagLayout());
		GridBagConstraints gbc;
		gbc= new GridBagConstraints();
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridwidth=1;
		gbc.gridheight=1;
		gbc.weightx=1;
		gbc.weighty=1;
		String[][] msg= {
				{"7","8","9","+"}
				,{"4","5","6","/"}
				,{"1","2","3","="}
				,{"0","."}
		};
		for(int i=0; i<4; i++) {
			String[] cols=msg[i];
			for(int j=0; j<cols.length; j++) {
				gbc.gridx=j;
				gbc.gridy=i;
				if(i==2&&j==3)gbc.gridheight=2;
				else gbc.gridheight=1;
				if(i==3&&j==0)gbc.gridwidth=2;
				else gbc.gridwidth=1;
				if(i==3&&j==1)gbc.gridx=2;
				p.add(new Button(cols[j]),gbc);
			}
		}
		
		add(new TextField(),BorderLayout.NORTH);
		add(p,BorderLayout.CENTER);
		setLocation(100-1920,100);
		setSize(300,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
