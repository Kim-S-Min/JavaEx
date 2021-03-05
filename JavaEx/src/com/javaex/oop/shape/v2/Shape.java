package com.javaex.oop.shape.v2;

//	추상 클래스 : 자신이 객체화 될 수 없고 자식클래스에게 필드와 메서드를 물려주는 역활
public abstract class Shape {
	//	필드
	protected int x;
	protected int y;
	
	//	생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 추상 클래스는 1개 이상의 추상 메서드를 갖는다(구현부가 없다
	//	public abstract void draw();	//	-> Drawable 인터페이스에 위임
	public abstract double area();
}
