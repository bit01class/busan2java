/*
	배열
	자료형[] 배열명=new 자료형[배열길이];
	호출 -> 배열명[인덱스]
	인덱스 법칙
		1. 0부터 시작
		2. 연속됨
		3. 마지막 번호 ==배열길이-1;
		4. ArrayIndexOutBoundException
	배열의 길이==배열명.length
*/

class Ex02{

public static void main(String[] args){
	int a1,a2,a3,a4,a5;// 변수의 선언
	int[] arr=new int[5];
	arr[0]=1;	//a1=1;
	arr[1]=3;	//a2=3;
	arr[2]=5;	//a3=5;
	arr[3]=7;	//a4=7;
	arr[4]=9;	//a5=9;
	
	for(int i=0; i<5; i++){
		arr[i]=1+2*i;
	}
	
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);

	for(int i=0;i<5; i++){
		System.out.println(arr[i]);
	}
	System.out.println(arr.length);
}

}




