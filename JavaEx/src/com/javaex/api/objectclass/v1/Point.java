package com.javaex.api.objectclass.v1;

//	v1. object 클래스를 살펴보자
//	아무것도 상속받지 않아도 최상위 부모 Object를 상속한다
//	객체의 출력 포맥을 변경 -> toString()을 오버라이드한다
public class Point {
	//	필드
	private int x;
	private int y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
		
	}

	@Override
	public String toString() {
		return String.format("Point(x=%d, y%d)", x, y);
	}
}
