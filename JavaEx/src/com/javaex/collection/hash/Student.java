package com.javaex.collection.hash;


public class Student {
	//	필드
	int id;
	String name;
	
	//	생성자
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
		
		
	}
	@Override
	public int hashCode() {
		//	객체의 유일 식별자 -> int
		//	두 객체
		return id;	//	왜 이걸로 인해서 메모리값들이 10으로 바뀌는 걸까?
		
		
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			//	캐스팅 가능
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id;	//	10학번의 홍길동이 두번 출력되지 않는다
		}
		return super.equals(obj);
		
		
	}
	
}
