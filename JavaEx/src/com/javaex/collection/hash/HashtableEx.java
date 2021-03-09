package com.javaex.collection.hash;


import java.util.Hashtable;
import java.util.Map;
public class HashtableEx {
	public static void main(String[] args) {
		//	Map 인터페이스
		Map<String, ClassRoom> map = new Hashtable<>();
		
		//	인덱스 접근이 아니라 키를 이용한 접근
		map.put("101", new ClassRoom("Java", "R101"));
		map.put("202", new ClassRoom("C", "R202"));
		map.put("303", new ClassRoom("Python", "R303"));
		
		System.out.println("MAP: " + map);
		//	KetSet -> HashSet -> 순서가 없다
		
		//	조회
		ClassRoom room = map.get("202");	//	Ket접근
		System.out.println("202 강의실: " + room);
		
		//	값의 변경
		map.put("202", new ClassRoom("Linux", "R202"));
		System.out.println("MAP: " + map);
		//	동일한 키를 사용하면 -> 내용을 덮어쓴다
		
		//	특정 키가 포함되어 있는가?
		System.out.println("MAP has 202 Key ? " + map.containsKey("202"));	//	(*중요 다시한번 내용들을 정리해보자
		
		
	}
}
