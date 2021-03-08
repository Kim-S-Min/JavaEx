package com.javaex.api;

	//	
public class WapperEx {
	public static void main(String[] args) {
		//	만들기
		//	deprecated: 향후 삭제될 에정 -> 빠른 시간 내에 다른 방식으로 코딩해야 한다
		Integer i = new Integer(10);	//	인코딩 된것이므로 더이상 사용하지 말라고 줄이 그어진것이다
		Float f = new Float(3.14159f);	//	경고와 같은 의미이다
		//	valueOf() static 메서드를 이용하자
		Character c= Character.valueOf('c');
		
		//	문자열로 초기화할 수 있다
		Integer i2 = Integer.valueOf("10");	//	이러한 방식을 추천
		Float f2 = Float.valueOf("3.14159f");
		Boolean b2 = Boolean.valueOf("false");
		//	파라미터로 전달된 문자열이 해당 타입으로 변환될 수 있느 형태의 문자열이어야 한다
		
		//	자동박싱이 지원된다
		Integer i3 = 10;	//	== Integer i3 = Integer.valueOf(10);
		
		//	유틸리티 메서드들
		//	parse 계열 메서드: 문자열을 이용, 해당 타입으로 변환, 다른 형태로 출력하는 메서드
		System.out.println(Integer.parseInt("-123"));	//	문자열 -> 정수
		System.out.println(Integer.parseInt("FF", 16));	//	16진수 FF -> 10진수 정수로 변환
		System.out.println(Integer.toBinaryString(28));	//	28을 2진수 형태의 문자열로 출력
		System.out.println(Integer.toHexString(28));	//	28을 16진수 형태의 문자열로 출력
		
		//	형변환 메서드들
		double d4 = i3.doubleValue();	//	double을 사용했기 때문에 소숫점이 출력된다
		System.out.println("형변환: " + d4);	//	자동박싱과 자동언박싱이
		 
		//	포장 클래스 역시 객체다	//	자동 언박싱이 수행된다
		Integer i4 = Integer.valueOf(2021);
		Integer i5 = Integer.valueOf(2021);
		System.out.println("i4 == i5 ? " + (i4 == i5));	//	false임을 주의해야 한다
		//	포장클래스 == 포장 클래스 -> 두 객체의 주소를 비교한 것
		
		//	값의 비교를 위해서는 언박싱비교, equals비교를 해야 한다
		System.out.println("값의 비교(undoxing): " + (i4.intValue() == i5.intValue()));	//	이렇게 되면 true가 출력된다
		System.out.println("값의 비교(equals): " + i4.equals(i5));	//	이렇게 되면 true가 출력된다
	}
	
}
