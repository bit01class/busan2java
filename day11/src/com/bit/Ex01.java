package com.bit;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 ver 0.3.0");
		java.util.Scanner sc;
		sc=new java.util.Scanner(System.in);
		int input=-1;
		Arr data=new Arr();
		while(true) {
			System.out.print("1.보기 2.상세보기 3.입력 4.삭제 0.종료>");
			input=sc.nextInt();
			if(input==0)break;
			if(input==1) {
				System.out.println("학번\t국어\t영어\t수학");
				for(int i=0; i<data.size(); i++) {
					int[] stu=(int[])data.get(i);
					System.out.print(stu[0]+"\t");
					System.out.print(stu[1]+"\t");
					System.out.print(stu[2]+"\t");
					System.out.print(stu[3]+"\n");
				}
			}else if(input==2) {
				System.out.print("학번>");
				input=sc.nextInt();
				for(int i=0; i<data.size(); i++) {
					int[] stu=(int[])data.get(i);
					if(input==stu[0]) {
						System.out.println("합계:"+(stu[1]+stu[2]+stu[3]));
					}
				}
			}else if(input==3) {
				int[] stu=new int[4];
				System.out.print("학번>");
				input=sc.nextInt();stu[0]=input;
				System.out.print("국어>");
				input=sc.nextInt();stu[1]=input;
				System.out.print("영어>");
				input=sc.nextInt();stu[2]=input;
				System.out.print("수학>");
				input=sc.nextInt();stu[3]=input;
				data.add(stu);
			}else if(input==4) {
				System.out.print("학번>");
				input=sc.nextInt();
				for(int i=0; i<data.size(); i++) {
					int[] stu=(int[])data.get(i);
					if(stu[0]==input) {data.remove(i);break;}
				}
			}
		}
	}

}








