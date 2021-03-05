package com.javaex.oop.shape.v1;

public class Rectangle extands Shape{
	
	//	필드
	private int width;
	private int height;
	
	//	생성자
	public Retangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다. %n,"
				x, y, width, heigth, area());
		
		
	}

	@Override
	public double area() {
	//	double area = Math.PI * Math.pow(radius, 2);
	//	return 0;
		return Math.PI * Math.pow(radius, 2);
	}
}

