/*
클래스의 구성요소
2. 변수
	1.static변수 - 클래스변수
	2.non-static변수 - [멤버]필드
call
static -> static		[클래스명.]변수명;
static -> non-static		참조변수.변수명;
non-static -> static		[클래스명.]변수명;
non-static -> non-static	[참조변수.]변수명;
특징
	1.전역변수의 특성...
	3.초기화없이 사용가능..
	2.default값이 존재...
	4.default값을 사용하든, 선언과 초기화가 동시 
*/
class Ex05{
public static int su1=1111;
public int su2=2222;

public static void main(String[] args){
	Ex05 me;
	for(int i=0; i<5; i++){
	me=new Ex05();
	me.su2++;
	me.func01();
	}
}
public void func01(){
	System.out.println(su2);
}
}



