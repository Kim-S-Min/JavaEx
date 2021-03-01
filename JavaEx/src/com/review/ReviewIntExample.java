package com.review;

public class ReviewIntExample {
	public static void main(String[] args) {
		int var1 = 10;	//	10진수
		int var2 = 012;	//	8진수
		int var3 = 0xA;	//	16진수
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		long lar1 = 10;
		long lar2 = 20;
		long lar3 = 20l;
		//	long lar4 = 1000000000000;	//	int타입의 저장 범위를 넘어서는 정수 리터럴에 l or L을 붙이지 않았기 때문이다.
		long lar5 = 1000000000000l;
		
		System.out.println(lar1);
		System.out.println(lar2);
		System.out.println(lar3);
		//	System.out.println(lar4);
		System.out.println(lar5);
		
		
	}
}
