package com.javaex.api.objectclaas.v3;

	//	v2. equals
	//	사용자 정의 클래스는 내부 값을 비교하는 방법을 자바가 알지 못한다
	//	두 값을 비교할 수 있는 방법을 equals 메서드로 알려줘야 한다
public class Point {
	//	필드
	private int x;
	private int y;
	
	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	객체 출력 or 문자열과 연결될 때 반환되는 문자열이다
	@Override
	public String toString() {
		return String.format("point(x=%d, y=%d)", x, y);
	}

	//	두 객체의 값의 비교를 수행
	@Override
	public boolean equals(Object obj) {	//	Object를 Point롤 캐스팅 해줘야 한다.
		if (obj instanceof Point) {
			//	obj -> 캐스팅
			Point other = (Point)obj;
			return this.x == other.x && this.y == other.y;
		}
		//	다른 타입은 비교방법 정의되지 않으므로 부모의 equals 값을 그냥 리턴
		return super.equals(obj);
	}
	
	

}
