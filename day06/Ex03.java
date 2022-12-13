class Lec03{
	// 클래스의 구성요소
	// 3. 생성자
	// public 클래스명(매개변수){실행코드;return;}
	// 객체 생성시점에 하고자 하는 일 명시
	// 객체 생성시 단 한번만 호출가능
	// 생성자를 정의 하지 않을시 디폴트생성자가 자동생성

	public final int su2;
	public Lec03(){
		su2=2222;
		System.out.println("디폴트생성자 호출"+su2);
	}
	public Lec03(int su){
		su2=su;
		System.out.println("객체 생성"+su2);
	}
}

class Ex03{
	// public Ex03(){}

public static void main(String[] args){
	Lec03 you;	// 0x0000~0xffff
	you=new Lec03(1111);
	System.out.println(you.su2);
	you=new Lec03(2222);
	System.out.println(you.su2);
	you=new Lec03(3333);
	System.out.println(you.su2);
}

}