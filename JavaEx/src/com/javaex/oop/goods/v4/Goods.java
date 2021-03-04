package com.javaex.oop.goods.v4;

//	v4. this : 객체 자신을 의마한다
//	this() : 내부에 있는 다른 생성자를 호출
public class Goods {
	//	필드
	// public > protected > default > private
	private String name;
	private int price;
	
	//	코드 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가
	//	하지만 사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다
	//	생성자1
	public Goods(String name) {
		this.name = name;
	}
	
	
	//	모든 필드를 초기화 하는 생성자
	public Goods(String name, int price) {
		
		//	this.name = name;
		this(name);
		this.price = price;
	}
	//	Getter/Setter
	//	getter만 있고, setter가 없으면 -> 
	public String getName() {	//	name을 위해서 String을 사용한다
		return name;
	}
	
//	public void setName(String name) {
//		this.name = name;	//	this 현재 instance값을 나타낸다
//	}
	
	public int getPrice() {
		return price;
	}
	
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//	출력용 매서드
	public void showInfo() {
		System.out.printf("상품이름: $s%n가격: %d원%n", name, price);
	}
}
