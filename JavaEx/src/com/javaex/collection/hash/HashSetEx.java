package com.javaex.collection.hash;


import java.util.HashSet;
public class HashSetEx {
	public static void main(String[] args) {
		basicHashSetEx();
		
		
	}
	private static void basicHashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		//	요소 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("HashSet: " + hs);	//	자료는 정상 출력이 되지만 순서는 유지하지 않는다
		System.out.println("요소의 수: " + hs.size());
		
		hs.add("Java");
		System.out.println("HashSet: " + hs);	//	hashset에서는 중복을 허용하지 않는다
		
		//	요소의 포함 여부 확인
		System.out.println("contauns Java ? " + hs.contains("Java"));
		System.out.println("contains Linux ? " + hs.contains("Linux"));
		
		System.out.println("HashSet: " + hs);
		
		//	요소의 삭제
		hs.remove("C++");
		System.out.println("HashSet: " + hs);
		
		//	요소비우기
		hs.clear();
		System.out.println("HashSet: " + hs);
		
		
	}
}
