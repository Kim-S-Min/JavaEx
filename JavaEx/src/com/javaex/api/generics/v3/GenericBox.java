package com.javaex.api.generics.v3;

//Generic
//설계시에는 내부 타입을 지정하지 않고
//-> 인스턴스화 할때 내부 타입을 지정해주는 방식
//T : Type
//R : Return Type
//K : Key
//V : Value
//... 다양한 템플릿 문자를 사용할 수 있다
public class GenericBox<K, V> {	//	<템플릿문자> 템플릿을 T로 줄여서 사용한다	//	내부에서 사용할 Key, Value의 타입을 미정 상태로 설계
	K key;
	V Content;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getContent() {
		return Content;
	}
	public void setContent(V content) {
		Content = content;
	}
}
