class Ex04{
//★ ★ ★ └★ ★ ★ └★ ★ ★└
public static void main(String[] args){
// 1 2 3 4  2 3 4 5  3 4 5 6  4 5 6 7
	int su1=1;
	int su2=5;
	int su3=9;
	int su4=su2;
	for(int i=0; i<su3; i++){
		System.out.print(i+1+" ");
		if((i+1)==su2&&i!=su3-1){
			System.out.println();
			for(int j=0; j<su4-1; j++){
				i--;
			}
			su2++;
		}
	}
}

}