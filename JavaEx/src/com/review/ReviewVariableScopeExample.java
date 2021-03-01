package com.review;

public class ReviewVariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//	int v3 = v1 + v2 + 5;	//	v2 변수를 사용할 수 없기 떄문에 컴파일 에러가 생긴다
		//	int result = v1 + v2 + 5;	//	result로 출력을 하려고 해도 v2 변수를 사용할 수 없다.
		
		//	System.out.println(result);	//	if문의 int v2가 정의되지 않았기 때문에 출력할 수 없다.
	}
}
