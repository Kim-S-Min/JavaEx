package com.review;

public class ReviewBooleanExample {
	public static void main(String[] args) {
		boolean stop = true;
		if(stop) {	//	if문은 상황을 예로 들고 예에 맞는 상황이 된다면 실행한다
			System.out.println("중지합니다.");
		} else {	//	else는 거짓(false)를 의미한다
			System.out.println("시작합니다");
		}
	}
}
