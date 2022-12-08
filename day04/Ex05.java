class Ex05{

public static void main(String[] args){

//Q2. 1~50까지의 합을 구하시오
	int sum1=0,sum2=0,sum12=0;
	for(int i=1; i<=50; i++){
		sum1+=i;
	}
	System.out.println("Q1.Sum="+sum1);
	int a=1;
	while(a<=50){
		sum2+=a++;
	}
	System.out.println("Q1.Sum="+sum2);

	int b=1;
	boolean boo=true;
	while(boo){
		sum12+=b;
		b++;
		if(b==51){boo=false;}
	}
	System.out.println("Q1.Sum="+sum12);

//Q3. 1+3+5+7+9=000을 출력하시오
//123456789=000
	int sum3=0;
	for(int i=1; i<10; i++){
	if(i%2==0){System.out.print("+");}
	else {System.out.print(i);sum3+=i;}
	}
	System.out.println("="+sum3);

//Q4. 1~50까지의 3의 배수를 출력하시오
	boolean boo4=true;
	int su4=1;
	while(boo4){
		if(su4%3==0){System.out.println(su4);}
		su4++;
		if(su4>50)boo4=!boo4;
	}
	for(int i=3; i<=50; i+=3){
		System.out.println(i);
	}
//Q5. 2,4,6,8,10 출력하시오
	

}
}





