package com.review.oop.good.v2;

//	v2.	생성자
//	new 키워드와 함께 사용되고 객체의 초기화를 담당한다
public class GoodsReviewExample {
	//	필드
	private String name;
	private int price;
	
	public GoodsReviewExample(String name, int price) {
		this.name = name;
		this.price = price;
		
		
	}
	public String getName() {
		return name;
		
		
	}
	
}