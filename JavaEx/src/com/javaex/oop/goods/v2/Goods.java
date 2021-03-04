package com.javaex.oop.goods.v2;

//	v2. 필드의 접근 제한
//	Getter와 Setter를 이룔한 필드의 우회 접근
public class Goods {
	//	필드
	// public > protected > default > private
	private String name;
	private int price;
	
	//	Getter/Setter
	public String getName() {	//	name을 위해서 String을 사용한다
		return name;
	}
	
	public void setName(String name) {
		this.name = name;	//	this 현재 instance값을 나타낸다
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	//	출력용 매서드
	public void showInfo() {
		System.out.printf("상품이름: $s%n가격: %d원%n", name, price);
	}
}
