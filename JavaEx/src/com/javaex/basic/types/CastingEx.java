package com.javaex.basic.types;


//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class CastingEx {
	public static void main(String[] args) {
		implicitCastingEx();
		explicitCastingEx();
	}
	
	//	명시적 캐스팅
	//	표현 범위가 넓은 자료형 -> 좁은 자료형 : 데이터의 유실 가능성이 있음
	//	개발자가 명시적으로 타입을 변환
	private static void explicitCastingEx() {
		double d = 1234.56;	//	8byte 실수
		System.out.println(d);
		
		float f = (float)d;	// 4byte 실수
		System.out.println(f);
		
		long l = (long)f;	//	8byte 정수
		System.out.println(l);
		
		int i = (int)l;	//	4byte 정수
		System.out.println(i);
		
		byte b = (byte)i;	//	1byte 정수
		System.out.print(b);
		
	}
	//	암묵적 캐스팅 (implicit casting: promption)
	//	표현 범위가 좁은 자료형 -> 넓은 자료형 : 자바가 자동변환
	private static void implicitCastingEx() {
		byte b = 25;	//	1byte 정수
		System.out.println(b);
		
		short s = b;	//	2byte 정수
		System.out.println(s);
		
		int i = s;	//	4byte 정수
		System.out.println(i);
		
		long l = i;	//	8byte 정수
		System.out.println(l);
		
		float f = l;	//	4byte 실수 //	long이 float보다 바이트 수는 크지만 표현 범위가 좁다
		System.out.println(f);
		
		double d = f;	// 8byte 실수
		System.out.println(d);
		
		
	}
}
