package com.review;

public class ReviewByteExample {
	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		//	byte var6 = 128;	//	컴파일 에러 (왜?)
		//	byte에 저장가능한 범위는 (-128 ~ 127)까지 이기 때문에 byte로만 출력을 한다면 출력되지 않을 것이다.
		//	이 문제는 com.review.ReviewByte에서 추가로 해결하자.
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
