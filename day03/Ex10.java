class Ex10
{

public static void main(String[] args)
{
	int kor=97, eng=98 , math=86;
	int sum=kor+eng+math;
	double avg=sum*100/3/100.0;
	String msg="학생성적관리프로그램(ver 0.1.0)";
	msg+="\n-------------------------------";
	msg+="\n국어: "+kor+", 영어: "+eng+" 수학: "+math;
	msg+="\n-------------------------------";
	msg+="\n합계: "+(sum)+"점, 평균: "+avg;
	msg+="\n-------------------------------";
	int su='F';
	if(avg>=60){
		su-=2;
	}
	if(avg>=70){
		su--;
	}
	if(avg>=80){
		su--;
	}
	if(avg>=90){
		su--;
	}
	msg+="\n학점: "+(char)su;
	
	/*
	switch(sum/3/10){
		case 10: case 9:
		msg+="\n학점: A";
		break;
		case 8:
		msg+="\n학점: B";
		break;
		case 7:
		msg+="\n학점: C";
		break;
		case 6:
		msg+="\n학점: D";
		break;
		default:
		msg+="\n학점: F";
	}
	*/
	System.out.println(msg);
}

}


/*
학생성적관리프로그램(ver 0.1.0)
-------------------------------
국어: 97, 영어: 79 수학:86
-------------------------------
합계: 000점, 평균:00.00 (소수둘째자리까지)
-------------------------------
학점: B

학점은  A	65	 90이상~100	10,9
	B	66	 80이상~90미만	80.00~89.99
	C	67	 70이상~80미만	70.00~79.99
	D	68	 60이상~70미만 60.00~69.99
	F	70	 60미만	(재수강 요망 출력)
*/