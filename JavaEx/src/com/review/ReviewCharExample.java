package com.review;

//	char를 사용할때 작은따음표를 사용한다
public class ReviewCharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';		//	문자
		char c5 = 44032;	//	10진수
		char c6 = '\uac00';	//	16진수
		
		int uniCode = c1;	//	유니코드 얻기
		int uniCode2 = c4;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		System.out.println(uniCode2);
		
		
	}
}
