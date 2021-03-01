package com.review;


//	Byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
/*	           char(2)
 * 	boolean(1)
 */
public class ReviewVariableExample {
	public static void main(String[] args) {
		//	10을 변수 value의 초기값으로 지정
		int value = 10;
		
		//	변수 value 값을 읽고 10을 더하면 산술 연산을 수행
		//	연산의 결과값을 변수 result의 초기값으로 저장
		int result = value + 10;
		
		//	변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);
		
		
	}
}
