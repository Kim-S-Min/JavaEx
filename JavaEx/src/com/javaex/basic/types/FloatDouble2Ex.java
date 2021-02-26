package com.javaex.basic.types;


//	실수
//	float(4byte), double(8byte)
//	(*표현 범위 : Byte(1) < Short(2) < Int(4) < Long(8) < Float(4) < Double(8)*)	-> 중요하다
public class FloatDouble2Ex {
	public static void main(String[] args) {
	float floatVar = 3.14159f;	//	F or f 접미해야 된다
	double doubleVar = 3.14159;	//	실수형 기본은 double이기 때문에 아무것도 적을 필요가 없다.
	
	int intVar = 300000000;
	floatVar = 3E7f;	//	3X10(7)
	doubleVar = 314159E-5;	//	3.14159 -> X10(-5)
	
	System.out.println("int:" + intVar);
	System.out.println("float" + floatVar);
	System.out.println("double" + doubleVar);
	
	//	부동소수점 계산의 유의점
	//	float, double 정밀도를 포기하고 표현 범위를 넓힌 자료형
	//	정밀계산에 활용시에는 유의
	System.out.println(0.1 * 3);	//	진수와 컴퓨터 구조간 제한된 byte에 의한 어쩔수 없는 오차
	
	
	}
}