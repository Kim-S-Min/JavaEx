package com.javaex.api.generics.v3;

public class IntBox {
	//	필드
	Integer content;	//	데이터의 차이가 있다
	
	//	생성자	//	기본 생성자로 사용한다
	//	public IntBox(Integer content) {
	//		this.content = content;
		
		
	//}
	//	getter/setter
	public Integer getContent() {	//	리턴타입의 차이
		return content;
	}

	public void setContent(Integer content) {	//	파라미터타입의 차이
		this.content = content;
	}
	
}
