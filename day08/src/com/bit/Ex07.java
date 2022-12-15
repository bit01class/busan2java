package com.bit;

/*
주민번호체크(ver 0.1.1)
주민번호>991231-2345678
당신은 00살 여성입니다

주민번호>9912312345678
입력확인바랍니다(000000-0000000)

주민번호>991231-234567
입력확인바랍니다(앞자리6개 뒷자리7개입니다)
 * */
public class Ex07 {

	public static void main(String[] args) {
		int age = 2022 - 1900;
		char gender = '여';
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		boolean boo2 = false;
		String msg = null;
		do {
			System.out.print("주민번호>");
			String input = sc.nextLine();
			boolean boo = false;

			for (int i = 0; i < input.length(); i++) {
				if (i != 6) {
					if (input.charAt(i) < '0' || input.charAt(i) > '9') {
						boo = true;
					}
				}
			}

			if (input.charAt(6) != '-') {
				msg = "입력확인바랍니다(000000-0000000)";
				boo2=true;
			} else if (input.length() != 14) {
				msg = "입력확인바랍니다(앞자리6개 뒷자리7개입니다)";
				boo2=true;
			} else if (boo) {
				msg = "입력확인바랍니다(숫자를 입력바랍니다)";
				boo2=true;
			} else {

				age -= (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0') * 1;
				if (input.charAt(7) > '2') {
					age -= 100;
				}
				age++;
				if (input.charAt(7) % 2 != 0) {
					gender = '남';
				}
				msg = "당신은 " + age + "세 " + gender + "성입니다";
				boo2 = false;
			}
			System.out.println(msg);
		} while (boo2);
	}

}
