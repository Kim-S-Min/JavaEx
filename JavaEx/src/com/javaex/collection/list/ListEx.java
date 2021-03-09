package com.javaex.collection.list;


import java.util.ArrayList;
//	import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class ListEx {
	public static void main(String[] args) {
		listClassEx();
		
		
	}
	private static void listClassEx() {
		//	List관련 클래스는 List인터페이스를 구현하고 있다
		//	List<String> lst = new LinkedList<>();	//	실제 클래스는 LinkedList	//	ArrayList는 개인적으로 해보자
		List<String> lst = new ArrayList<>();
		
		System.out.println("lst: " + lst);	//	비어있는 리스트이다
		System.out.println("size of lst: " + lst.size());	//	메모리 접근이 느리다
		
		//	객체 추가
		lst.add("Java");	//	add는 객체 추가, 삽입을 할때 사용한다
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		System.out.println("lst: " + lst);
		System.out.println("size of lst: " + lst.size());
		
		//	객체 삽입
		lst.add(2, "C#");
		System.out.println("lst: " + lst);
		System.out.println("size of lst: " + lst.size());
		
		//	List는 중복 삽입을 허용한다	//	위치를 지정해 주지 않으면 맨 마지막에 추가가 된다
		lst.add("Java");
		System.out.println("lst: " + lst);
		
		//	객체 조회	//	찾는 방식이 0번부터 시작해서 인덱스를 하나씩 찾는다
		System.out.println("2번 인덱스: " + lst.get(2));	//	get은 객체 조회에 사용한다
		
		//	루프
		for (String item: lst) {	//	Vector나 Enumeration을 사용한다면 List에서 Iterator를 사용한다
			System.out.print(item + " ");
		}
		System.out.println();
		
		//	반복자를 이용한 순회: 추천(다른곳에서도 많이 사용한다)
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {	//	뒤에 내용이 더 있는가?
			String item = it.next();
			System.out.print(item + " ");
		}
		System.out.println();
		
		//	객체 삭제
		lst.remove(2);	//	인덱스를 이용한 삭제
		lst.remove("Python");	//	객체를 이용해서 삭제
		System.out.println("lst: " + lst);
		
		//	객체 검색
		int position = lst.indexOf("Java");
		System.out.println("lst Search: " + position);
		position = lst.indexOf("Linux");	//	없는 객체의 검색
		System.out.println("없는 객체 검색: " + position);	//	없는 객체를 검색하면 -1이 출력된다
		
		//	비우기
		lst.clear();	//	clear는 전체를 지울때 사용한다
		System.out.println("lst: " + lst);
		
		
	}
}
