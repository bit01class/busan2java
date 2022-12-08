class Ex04{

public static void main(String[] args){
int su=0;
int dan=2;
while(++su<10){	
	dan=1;
	while(++dan<10){
		System.out.print(dan+"x"+su+"\t");
	}
	System.out.println();
}

System.out.println("------------------------------------------");

	boolean boo=true;
	int dan2=2, su2=1;
	while(boo){
		System.out.print(dan2+"x"+su2+"\t");

		if(dan2==9&&su2==9){
			boo=false;			
		}else if(dan2==9){
			System.out.println();
			dan2=2;
			su2++;
		}else{
			dan2++;
		}
	}

}

}


/*
Q1. 구구단(while)

Q2. 1~50까지의 합을 구하시오
Q3. 1+3+5+7+9=000을 출력하시오

Q4. 1~50까지의 3의 배수를 출력하시오

Q5. 2,4,6,8,10 출력하시오

*/