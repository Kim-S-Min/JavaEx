package com.javaex.oop.staticmember;

public class StaticEx {
	//	클래스 변수(static)
	//		: 모든 인스턴스에서 공유
	//		: static -> instance (X)
	//		: instance -> static (O)
	public static int refcount;	//	(인스턴스 생성시+ / 인스턴스 삭제시-)
	public static String classVar;
	//	인스턴스 변수
	//		: 개별 객체 내부에서만 접근
	public String instanceVar;
	
	//	static 영역의 초기화는 static 블록에서 할 수 있다
	//	클래스가 로드될 때 단 한번 실행한다
	static {
		refcount = 0;
		classVar = "클래스 변수";
		System.out.println("=> Static Block");
		//	intstanceVar = "인스턴스 변수"	//	static -> instance 멤버X
	}
	
	//	생성자
	public StaticEx() {
		refcount++;	//	instance -> static (O)
		System.out.println("=> Instance 생성");
		System.out.println("=> 참조 Count:" + refcount);
	}
	
	//	소멸자
	@Override
	protected void finalize() throws Throws {
		
	}
}
