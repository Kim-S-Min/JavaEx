package com.javaex.oop.casting;


public class Cat  extends Animal {	//	특별하게 명시하지 않으면 자바가 기본생성자를 만든다	//	cat자체에는 생성자가 없다
	//	생성자 구현
	public Cat(String name) {	//	super()로 생성자를 만든다
		super(name) ;	//	cat에 대한 생성자
		
		
	}
	//	메서드
	public void meow() {
		System.out.println(name + ": 야옹~");
	}
	
}
