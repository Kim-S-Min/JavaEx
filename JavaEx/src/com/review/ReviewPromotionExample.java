package com.review;

//	자동 타입 변환에 대한 복습

//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
//	(byte ~ long)은 정수를 나타내고 (float, double)은 실수를 나타낸다
public class ReviewPromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	//	int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;	//	int <- char
		System.out.println("'가'의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;	//	long <- int
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//	double <- int
		System.out.println(doubleValue);
		
		
	}
}
