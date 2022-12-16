package com.bit;

public class Ex01 {
	
	public static void func03() {
		System.out.println("func03 start");
		int su=5;
		for(int i=0; i<10; i++) {
			switch(i) {
				case 5 :break;
				case 3 :
				case 1 :
			}
			System.out.println("실행중..."+i);
		}
		System.out.println("func03 end");
	}
	
	public static void func02() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(i==2)continue;
				System.out.println("i="+i+",j="+j);
			}
		}
		
	}

	public static void main(String[] args) {
		// continue; - 반복문 - 이번반복에서 이후 실행문을 skip
		// break; - switch문, 반복문 - 최근반복문의탈출
		// return; - 메서드내부 어디서든 - 메서드의 탈출
		func02();
	}
	public static void func01() {
		for(int i=0; i<10; i++) {
			System.out.println("before i="+i);
			if(i>5)continue;
			System.out.println("after i="+i);
		}
	}

}
