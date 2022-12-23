package com.bit;

interface Ball{
	void play();
}

class BaseBall implements Ball{
	String msg;
	BaseBall(){
		msg="거친 실밥이 박혀있는 ";
	}
	public void play() {
		System.out.println(msg+"공을 던지고 놉니다");
	}
}

class Lotto implements Ball{
	String msg;
	
	Lotto(int su){
		msg=su+"번";
	}
	
	public void play() {
		System.out.println(msg+"입니다");
	}
}

class Box<AT>{
	AT su;
	
	void setSu(AT su) {
		this.su=su;
	}
	AT getSu() {
		return su;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		BaseBall ball2=new BaseBall();
		Lotto ball1=new Lotto(45);
		
		
		Box<String> box=new Box<String>();
		box.setSu("abcd");
		
		String su=box.getSu();

	}

}
