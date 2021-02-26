package com.javaex.basic.types;

//	실수
//	float(4) < double(8)
//	정미로를 포기하고 표현 범위를 넓힌 자료형
//	*표현 범위 : byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)* -나중에 확인 
public class FloatDoubleEx {
	public static void main(String[] args) {
		float floatVar = 3.14159f;	//	F or f 접미
		double doubleVar = 3.14159;	//	실수형 기본은 double이기에 아무것도 적을필요가 없다.
		
		int intVar = 30000000;
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
