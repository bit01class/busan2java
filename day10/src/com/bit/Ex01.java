package com.bit;
//학생성적관리프로그램(0.2.0)
		// 교과목 - java, web, framework
		// 1. 리스트 2.입력 3.상세보기 ㅋ 0.종료>
		// 리스트에서 데이터만 -학번,j,w,f
		// 상세보기 - 각 학점 합계 평균 학점
public class Ex01 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(0.2.0)");
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=0;
//		System.out.print("총원>");
//		input=sc.nextInt();
		int[] data=new int[input*4];
		int cnt=0;
		while(true) {
			System.out.print("1.리스트  2.입력  3.상세보기  0.종료>");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println("------------------------------");
				System.out.println("학번\tjava\tweb\tframework");
				System.out.println("------------------------------");
				for(int i=0; i<data.length; i++) {
					System.out.print(data[i++]);
					System.out.print('\t');
					System.out.print(data[i++]);
					System.out.print('\t');
					System.out.print(data[i++]);
					System.out.print('\t');
					System.out.print(data[i]);
					System.out.print('\n');
				}
				System.out.println("------------------------------");
			}else
			if(input==2) {
				int[] before=data;
				data=new int[data.length+4];
				System.arraycopy(before, 0, data, 0, before.length);
				System.out.print("학번>");
				input=sc.nextInt();
				data[cnt++]=input;
				System.out.print("java>");
				input=sc.nextInt();
				data[cnt++]=input;
				System.out.print("web>");
				input=sc.nextInt();
				data[cnt++]=input;
				System.out.print("framework>");
				input=sc.nextInt();
				data[cnt++]=input;
			}else
			if(input==3) {
				System.out.print("학번>");
				input=sc.nextInt();
				for(int i=0; i<data.length; i+=4) {
					if(input==data[i]) {
						int sum=data[++i]+data[++i]+data[++i];
						double age=sum*100/3/100.0;
						char ch='F';
						if(sum>=3*90)ch='A';
						else if(sum>=3*80)ch='B';
						else if(sum>=3*70)ch='C';
						else if(sum>=3*60)ch='D';
						System.out.println(input+"학번 합계:"+sum);
						System.out.println(input+"학번 평균:"+age);
						System.out.println(input+"학번 학점:"+ch);
						break;
					}
				}
				System.out.println(input+"학번의 합계,평균,학점");
			}
		}
	}

}





