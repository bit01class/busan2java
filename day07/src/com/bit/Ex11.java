package com.bit;

public class Ex11 {

	public static void main(String[] args) {
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		System.out.println("주민번호체크(ver 0.1.0)\r\n"); 
		System.out.print("주민번호>");
		String input=sc.nextLine();
		char[] arr=input.toCharArray();
		char gender='x';
		boolean boo=false;
		
		char[] arr2=new char[10];
		arr2[0]='영';
		arr2[1]='일';
		arr2[2]='이';
		arr2[3]='삼';
		arr2[4]='사';
		arr2[5]='오';
		arr2[6]='육';
		arr2[7]='칠';
		arr2[8]='팔';
		arr2[9]='구';
		for(int i=0; i<arr.length; i++) {
			char target=arr[i];
			if(i!=6) {
			for(int j=0; j<arr2.length; j++) {
				if(target==arr2[j])arr[i]=(char)(j+'0');
			}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i!=6&&(arr[i]<'0'||arr[i]>'9'))boo=true;
		}
		
		if(arr[6]!='-'){
			System.out.println("입력확인바랍니다(000000-0000000)");
		}else if(arr.length!=6+1+7) {
			System.out.println("입력확인바랍니다(앞자리6개 뒷자리7개입니다)");
		}else if(boo) {
			System.out.println("입력확인바랍니다(숫자를 입력바랍니다)");
		}else{
			int age=2022-(1900+(arr[0]-'0')*10+(arr[1]-'0'))+1;
			if(arr[7]>'2')age-=100;
			if(arr[7]%2!=0) {
				gender='남';
			}else if(arr[7]%2==0) {
				gender='여';
			}
			System.out.println("당신은 "+age+"살 "+gender+"성입니다");
		}
	}

}
