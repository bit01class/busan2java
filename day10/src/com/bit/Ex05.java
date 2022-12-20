package com.bit;
//학생성적관리프로그램(0.2.0)
		// 교과목 - java, web, framework
		// 1. 리스트 2.입력 3.상세보기 ㅋ 0.종료>
		// 리스트에서 데이터만 -학번,j,w,f
		// 상세보기 - 각 학점 합계 평균 학점
public class Ex05 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(0.2.0)");
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=0;
		while(true) {
			System.out.print("1.리스트  2.입력  3.상세보기  0.종료>");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println("리스트 출력");
			}
			if(input==2) {
				System.out.print("학번>");
				input=sc.nextInt();
				System.out.print("java>");
				input=sc.nextInt();
				System.out.print("web");
				input=sc.nextInt();
				System.out.print("framework");
				input=sc.nextInt();
			}
			if(input==3) {
				System.out.print("학번>");
				input=sc.nextInt();
				System.out.println(input+"학번의 합계,평균,학점");
			}
		}
	}

}





