/*
계산기(ver 0.1.0)
첫번째 숫자를 입력하시오>4
두번째 숫자를 입력하시오>2
1.+ 2.- 3.× 4.÷ > 1
결과>
4+2=6
*/
class Ex06{
public static void main(String[] args){
	java.util.Scanner sc=new java.util.Scanner(System.in);
	int su1,su2,su3;
	boolean boo=true;
	System.out.println("계산기(ver 0.1.0)");
	System.out.print("첫번째 숫자를 입력하시오>");
	su1=sc.nextInt();
	System.out.print("두번째 숫자를 입력하시오>");
	su2=sc.nextInt();
	System.out.print("1.+ 2.- 3.× 4.÷ >");
	su3=sc.nextInt();
	System.out.println("결과>");
/*
	String msg="+";
	if(su3==4&&su1%su2!=0){
		double result=su1*1.0/su2;
		msg="÷";
		System.out.println(su1+msg+su2+"="+result);
		boo=false;
	}else if(su3>0 && su3<5){
		int result=0;
		if(su3==1){
		result=su1+su2;
		msg="+";
		}else if(su3==2){
		result=su1-su2;
		msg="-";
		}else if(su3==3){
		result=su1*su2;
		msg="×";
		}else if(su3==4&&su1%su2==0){
		result=su1/su2;
		msg="÷";
		}
		System.out.println(su1+msg+su2+"="+result);
		boo=false;
	}else{
		System.out.println("연산의 선택이 잘못되었습니다");
		System.out.println("1~4사이로 다시 확인하시고 입력바랍니다");
	}
	}
*/
	if(su3==1) gugu(su1,su2,su1+su2,'+');
	else if(su3==2) gugu(su1,su2,su1-su2,'-');
	else if(su3==3) gugu(su1,su2,su1*su2,'×');
	else if(su3==4&&su1%su2==0) gugu(su1,su2,su1/su2,'÷');
	else if(su3==4) gugu(su1,su2,su1*1.0/su2,'÷');
}

public static void gugu(int a, int b,int result,char ch){
	System.out.println(a+""+ch+b+"="+result);
}
public static void gugu(int a, int b,double result,char ch){
	System.out.println(a+""+ch+b+"="+result);
}

}






