package com.bit;

class Ex09{
	private Ex09(){}
// 접근제한자(class > 생성자, 전역변수, 메서드)
// public - 어디서든 접근 허용
// default - 동일패키지에서만 접근을 허용
// private - 외부에서 접근 불가능
///////////////
// class - public,default
// 생성자 - public,default,private
// 전역변수, 메서드 - public,default,private

private static Ex09 me=new Ex09();

public static Ex09 newInstance(){
	return me;
}

public static void main(String[] args){
	//System.out.println(com.bit.Ex10.su1);
	//System.out.println(com.bit.Ex10.su2);
	//System.out.println(Ex10.su3);
	com.bit2.Ex10.func01();
	com.bit2.Ex10 ex;
	ex=new com.bit2.Ex10(1,2);
}

}