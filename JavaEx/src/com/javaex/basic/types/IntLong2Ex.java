package com.javaex.basic.types;

//	정수 타입 연습
//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
public class IntLong2Ex {
	public static void main(String[] args) {
		int intVar = 2021;
		//	타입의 byte범위를 넘어가는 값을 할당할 수는 없다.
		int intVar2;
		//	*intVar2 = 123456789012345; 를 하면 범위를 초과하는 수이기에 int로는 담을수 없다
		long longVar = 2021;
		long longvar2 = 123456789012345L;	//	정수 뒤 L or l은 long임을 증명한다.
		
		//	short type
		short s1 = 100;
		short s2 = 200;
		//	*short result = s1 + s2;는 정수+정수의 합산일 경우 short나 byte는 int로 변환되어 연산된다.
		int result = s1 + s2;
		System.out.println(s1 + "+" + s2 + "=" + result);	// +는 연산자에 해당,"+"는 출력되는 이미지에 해당
		
		
		//	2진수, 8진수, 16진수 표현법
		int bin, oct, hex;
		
		bin = 0b110;	//	0b를 접두어 -> 2진수
		oct = 072;	//	0을 접두어 -> 8진수
		hex = 0xff;	//	0x를 접두어 -> 16진수
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
	}
}
