class Ex03{

public static void main(String[] args){

	// 반복문 
	// 2. while문 
	/*
		ⓐ
		while(ⓑtrue/false){
			반복구문;ⓒ
		}
		ⓓ
		ⓐ→ⓑ(true)→ⓒ→ⓑ(true)→ⓒ→ⓑ(true)→ⓒ→ → →ⓑ(false)→ⓓ
	*/	
		int a=0;
		while(a++<10){
			System.out.println(a+"번 실행");
		}

	// 3.do~while문
	/* 
	반드시 한번의 실행을 보장
	while()뒤에 ;
		ⓐ
		do{
			반복구문;ⓒ
		}while(ⓑtrue/false);

		ⓐ→ⓒ→ⓑ→ⓒ→ⓑ→ⓒ→ⓑ→ → ⓒ→ⓑ(false)→ⓓ
	*/
	
}

}