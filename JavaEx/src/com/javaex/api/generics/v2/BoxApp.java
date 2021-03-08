package com.javaex.api.generics.v2;


public class BoxApp {
	public static void main(String[] args) {
		//	Generic으로 설계된 클래스는
		//	new(인스턴스화)할 때 내부 데이터 타입을 지정할 수 있다
		GenericBox<Integer> intBox = new GenericBox<>();	//	앞에 integer가 지정되어 있기 때문에 같은 내용인 뒤에 박스에도 인티져를 넣을 필요는 없다
		GenericBox<String> strBox = new GenericBox<>();	//	내부데이터를 String
		
		intBox.setContent(2021);	//	컴파일러가 내부에 담길 타입 체크
		//	intBox.setContent("Java");	//	컴파일러가 타입 체크를 할 수 있다 -> 안정성을 확보할 수 있다	//	int로 설정되어 정수로만 표현이 가능
		
		strBox.setContent("Java");
		
		int retVal = intBox.getContent();	//	캐스팅이 불필요하다
		String retStr = strBox.getContent();
		
		System.out.println("intBox의 내용물: " + retVal);
		System.out.println("strBox의 내용물: " + retStr);
	}

}
