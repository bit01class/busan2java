package com.my;
// 클래스의 이름은 첫글자 대문자 영문으로 시작
// 영문숫자 조합에 띄어쓰기 불가
class Ex02
{
// 클래스의 구성요소 
// 1. 메서드
// public static (return값의)자료형 메서드명(매개변수...){실행코드;}
// 메서드명(매개변수값...);을 통해 호출
// 단 호출에 있어 매개변수의 갯수와 타입이 모두
// 일치해야만 호출가능
// 메서드의 이름은 원칙적으로 중복 불가능
// 단, 일부허용-> 메서드 오버로드
	// 매개변수의 유무,타입,갯수가 서로다른 경우

public static void main(String[] args){
	System.out.println("시작");
	int a=1111;
	func01(2222);
	System.out.println("종료"+a);
	while(true){
		int c=1;
		System.out.println(c);
		c++;
	}
	System.out.println(c);
}
public static void func01(int a){
	System.out.println("a="+a);
	return;
}







}