package com.javaex.oop.staticmember;

//	미션 : 어떤 상황에서도 단 하나의 인스턴스만을 유지해야 한다
//	생성자 -> 접근금지
public class Singleton {
	
	//	static 영역에 단 하나의 인스턴스객체를 담아둔다
	private static Singleton instance = new Singleton();
	
	//	생성자
	private Singleton() {	//	private를 사용하여 다른 사용자가 사용하지 못한다
		//	private 때문에 new호출이 불가능하다
		//	이럴때 getter을 사용한다
	}
	
	public static Singleton getInstance() {
		return instance;
	}
}
