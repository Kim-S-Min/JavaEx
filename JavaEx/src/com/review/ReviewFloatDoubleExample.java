package com.review;

public class ReviewFloatDoubleExample {
	public static void main(String[] args) {
		//	실수값 저장
		double var1 = 3.14;
		//	float var2 = 3.14;	//	컴파일 에러
		float var2 = 3.14f;	//	f or F
		
		
		//	정밀도 테스트
		double var3 = 0.1234567890123456789;
		float var4 = 0.1234567890123456789f;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//	e 사용하기
		int var5 = 3000000;
		double var6 = 3e6;
		float var7 = 3e6f;
		double var8 = 2e-3;
		float var9 = 2e-3f;
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		
		
	}
}
