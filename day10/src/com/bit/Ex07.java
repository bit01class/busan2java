package com.bit;
// 자바의 장점 
// 3.다형성
interface Machine{
	void on();
	void off();
	abstract void work();
}

class Tv implements Machine{
	public void on() {
		System.out.println("켜다");
	}
	public void off() {
		System.out.println("끄다");
	}
	public void work() {
		System.out.println("방송 주파수를 잡아 화면과 소리를 출력해준다");
	}
}

class Radio implements Machine{
	public void on() {
		System.out.println("켜다");
	}
	public void off() {
		System.out.println("끄다");
	}
	public void work() {
		System.out.println("주파수를 잡아 소리를 들려준다");
	}
}

class Audio implements Machine{
	public void on() {
		System.out.println("켜다");
	}
	public void off() {
		System.out.println("끄다");
	}
	public void work() {
		System.out.println("음악을 들려준다");
	}
}


public class Ex07 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.print("1.tv 2.radio 3.audio>");
		int input=sc.nextInt();
		Machine remote;
		if(input==1) {
			remote=new Tv();
		}else if(input==2){
			remote=new Radio();
		}else {
			remote=new Audio();
		}
		remote.on();
		remote.work();
		remote.off();
	}

}





