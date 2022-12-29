package com.ui;

import java.awt.*;

public class Ex02 extends Frame{

	public static void main(String[] args) {
		Ex02 me=new Ex02();
		Dimension dim=new Dimension();
		dim.width=500;
		dim.height=200;
		Toolkit tool=Toolkit.getDefaultToolkit();
		Dimension dim2=tool.getScreenSize();
		int w=dim2.width/2-dim.width/2;
		int h=dim2.height/2-dim.height/2;
//		me.setBounds(w, h, dim.width, dim.height);
		me.setLocation(w,h);
		me.setSize(dim);
		me.setVisible(true);
	}

}
