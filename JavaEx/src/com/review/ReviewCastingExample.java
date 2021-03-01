package com.review;


public class ReviewCastingExample {
	public static void main(String[] args) {
		//	CastingExample();	//	강제 타입 변환에 대한 복습
		ValueBeforeCasting();	//	변환으로 인한 데이터 손실이 발생되지 않게 하는 복습
		
		
	}
	//	강제 타입 변환에 대한 복습
	private static void CastingExample() {
		int intValue = 44032;	//	'가'에 대한 유니코드
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;	//	8바이트 정수표현을 4바이트 정수표현으로 변환한다
		System.out.println(intValue);
		
		double doubleValue = 3.14159;
		intValue = (int) doubleValue;	//	실수를 정수로 변환한다
		System.out.println(intValue);
		
		
	}
	//	변환으로 인한 데이터 손실이 발생되지 않게 하는 복습
	private static void ValueBeforeCasting() {
		int i = 128;	//	byte로는 (-128~127)까지만 정확한 숫자로 표현이 가능하다
		
		if((i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {	//	<- byte타입으로 변환이 가능하다면 128이라는 값을 출력한다.
			byte b = (byte)i;
			System.out.println(b);
			
			
		}
	}
}
