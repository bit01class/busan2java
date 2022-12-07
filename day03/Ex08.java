class Ex08
{

public static void main(String[] args)
{
	//문자열
	char ch1='A';
	String st1;
	st1="길이 제한이 없습니다";
	System.out.println(ch1);
	System.out.println(st1);
	System.out.println("문자열2");

	System.out.println("-------------------------");
	String st2="문자";
	String st3="열";
	String st4=2000+22+"년";		//st2+st3+true;
	String st5="year"+(2000+22);
	System.out.println(st5);
	System.out.println(st2+'열');
	int su=2;
	if("문자"+su=="문자2"){
		System.out.println("if ok");
	}
	switch("문자"+su){
	case "문자2":
		System.out.println("switch ok");break;
	}

}

}







