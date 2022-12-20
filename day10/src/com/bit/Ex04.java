package com.bit;
//학생성적관리프로그램(0.2.0)
		// 교과목 - java, web, framework
		// 1. 리스트 2.입력 3.상세보기 ㅋ 0.종료>
		// 리스트에서 데이터만 -학번,j,w,f
		// 상세보기 - 각 학점 합계 평균 학점
public class Ex04 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(0.2.0)");
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=0;
		String data="";
		while(true) {
			System.out.print("1.리스트  2.입력  3.상세보기  0.종료>");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println("--------------------------");
				System.out.println("학번\tjava\tweb\tframework");
				System.out.println("--------------------------");
				System.out.print(data);
				System.out.println("--------------------------");
			}
			if(input==2) {
				System.out.print("학번>");
				input=sc.nextInt();
				data+=input+"\t";
				System.out.print("java>");
				input=sc.nextInt();
				data+=input+"\t";
				System.out.print("web>");
				input=sc.nextInt();
				data+=input+"\t";
				System.out.print("framework>");
				input=sc.nextInt();
				data+=input+"\n";
			}
			if(input==3) {
				System.out.print("학번>");
				input=sc.nextInt();
				String[] arr1=data.split("\n");
				for(int i=0; i<arr1.length; i++) {
					String[] arr2=arr1[i].split("\t");
					if(arr2[0].equals(input+"")) {
						int sum=inputSu(arr2[1])
								+inputSu(arr2[2])
								+inputSu(arr2[3]);
						System.out.println("합계:"+sum);
						break;
					}
				}
			}
		}
	}
	// String input을 숫자로 바꿔주는 기능
	public static int inputSu(String input) {
		int sum=0;
		int m=0;int n=1;
		for(int i=input.length()-1; i>=0; i--) {
			for(int j=0; j<m; j++) {n*=10;}
			sum+=(input.charAt(i)-'0')*n;n=1;m++;
		}
		return sum;
	}
}





