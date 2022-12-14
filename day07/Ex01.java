/*
1
1 2
1 2 3
1 2 3 4 
1 
2 3 
4 5 6 
7 8 9 10
*/
class Ex01{

public static void main(String[] args){
	int su1=1;
	for(int x=0; x<3; x++){
		su1=1;
		for(int y=0; y<x+1; y++){
			System.out.print(su1+++" ");
		}
		System.out.println();
	}

}

}