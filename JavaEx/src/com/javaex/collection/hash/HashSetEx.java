package com.javaex.collection.hash;


import java.util.HashSet;
import java.util.Iterator;
public class HashSetEx {
	public static void main(String[] args) {
		basicHashSetEx();
		//	customHashSetEx();
		
		
	}
	private static void customHashSetEx() {
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("전우치", 30);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println("학생부: " + hs);	//	요소들은 작동을 하지만 순서는 유지되지 않는다
		
		Student s4 = new Student("홍길동", 10);
		hs.add(s4);
		System.out.println("hashCode of s1: " + s1.hashCode());	//	메모리 주소가 출력된다 (object해쉬코드)
		System.out.println("hashCode of s4: " + s4.hashCode());
		System.out.println("s1 equals s4 ? " + s1.equals(s4));	//	두 해시코드의 메모리 주소가 같은지 확인할 수 있다
		
		System.out.println("학생부: " + hs);
		
		//	포함 여부 확인
		boolean exists = hs.contains(new Student("홍길동", 10));
		System.out.println("홍길동(10) exists: " + exists);
		
		
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
		
		
		//	반복자 활용
		Iterator<String> it = map.keySet().iterator();
		while (it.equals(hasNext()) {
			ClassRoom item = map.get(it.net());
			System.out.println(item);
		}
		//	요소의 삭제
		hs.remove("C++");
		System.out.println("HashSet: " + hs);
		
		//	요소비우기
		hs.clear();
		System.out.println("HashSet: " + hs);
		
		
	}
}
