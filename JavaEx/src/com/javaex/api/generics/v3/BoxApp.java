package com.javaex.api.generics.v3;


public class BoxApp {
	public static void main(String[] args) {
		//	Generic으로 설계된 클래스는
		//	new(인스턴스화)할 때 내부 데이터 타입을 지정할 수 있다
		//	Key타입이 String, Value타입이 Integer
		GenericBox<String, Integer> intBox = new GenericBox<>();
		intBox.setKey("Integer");
		intBox.setContent(2011);
		
		//	값을 가져오자
		int retVal = intBox.getContent();	//	캐스팅이 불필요하다
		System.out.println("키: " + intBox.getKey() + ", 값은: " + retVal);
		
		}
}
