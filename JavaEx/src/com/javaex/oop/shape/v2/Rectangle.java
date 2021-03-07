package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable {
	
	//	필드
	private int width;
	private int height;
	
	//	생성자
	public Rectangle(int x ,int y ,int width ,int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public void draw() {
		System.out.printf(
				"원[x=%d, y=%d, r=%f, area=%f]을 그렸습니다. %n,",
				x, y, width, height, area());
		
		
	}

	@Override
	public double area() {
	//	double area = Math.PI * Math.pow(radius, 2);
	//	return 0;
		return width * height;
	}
}

