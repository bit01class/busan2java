/*
Q1. A~Z까지 출력하시오
	A,B,C,...
Q2. A(a)~Z(z)까지 출력하시오
	A(a),B(b),C(c),....
Q3. 다음을 출력하시오 
1 2 3
4 5 6
7 8 9
Q4. 다음을 출력하시오 
1 2 3
2 3 4
3 4 5
Q5. 다음을 출력하시오
■ ■ ■
■ ■ ■
■ ■ ■
*/

public class Ex11{

public static void main(String[] args){
	boolean boo=true;
	int cnt=0;
	int gap='a'-'A';
	while(boo){
		System.out.print((char)(gap+'A'+cnt++));
		
		if('A'+cnt-1=='Z')boo=false;
	}
}
}






