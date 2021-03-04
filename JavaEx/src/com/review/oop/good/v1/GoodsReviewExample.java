package com.review.oop.good.v1;

//	v2.	필드의 접근 제한
//	getter/setter 를 이용한 필드의 우회 접근

public class GoodsReviewExample {
	//	필드
	//	public > protected > default > private | 정보 접근 수준
	private String name;
	private int price;
	
	//	Getter / Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {	//	문자열을 출력하기 때문에 String
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {	//	정수를 출력하기 때문에 int
		this.price = price;
	}
	
	//	출력용 메서드
	public void showInfo() {
		System.out.printf("상품 이름:%s%n가격 : %d원%n", name, price);
	}
	
}
