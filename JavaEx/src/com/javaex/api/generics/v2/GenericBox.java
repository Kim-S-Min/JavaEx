package com.javaex.api.generics.v2;

//	Generic
//	설계시에는 내부 타입을 지정하지 않고
//	-> 인스턴스화 할때 내부 타입을 지정해주는 방식
//	T : type
//	R : Return Type
public class GenericBox<T> {	//	<템플릿문자> 템플릿을 T로 줄여서 사용한다
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	
}
