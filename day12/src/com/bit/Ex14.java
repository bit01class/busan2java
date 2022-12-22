package com.bit;

public class Ex14 {

	public static void main(String[] args) {
		try {
			Class.forName("com.bit.Ex04");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
