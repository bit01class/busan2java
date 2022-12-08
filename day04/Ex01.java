class Ex01
{

public static void main(String[] args)
{
	// 제어문(반복문)
	// for반복문
	/*	ⓐ
		for(초기화ⓑ; 조건식ⓒ; 증감식ⓓ){
			반복될 구문ⓔ;
		}
		ⓕ
		ⓐ→ⓑ→ⓒ→ⓔ→ⓓ→ⓒ→ⓔ→ⓓ→ⓒ→ⓔ→ → →ⓓ→ⓒ(false)→ⓕ
	*/
	int i;
	System.out.println("반복전...");
	for(i=0; i<10; i++){
		System.out.println(i+1+"번 반복..");
		System.out.println("....");
	}
	System.out.println("반복후..."+i);
}

}



