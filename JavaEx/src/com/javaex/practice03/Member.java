package com.javaex.practice03;


//	Member클래스는 회원 아이디를 나타내는 id(문자열)와 회원이름을 나타내는 name(문자열),
//	회원의 point를 나타내는 point(정수)필드를 가지고 있다

//	메소드는 회원의 이름변경 setName메소드와 이름을 반환하는 getName,
//	포이트를 변경하는 setPoint와 포인트를 반환하는 getPoint,
//	회원아이디를 변경하는 setId, 반환하는 getId메소드를 가지고 있다

//	모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻어가지 못하도록
//	private로 접근 제한을 막고, 메소드는 제한없이 모드 호출할 수 있는
//	접근제한자를 사용한다
public class Member {
	String name;
	String id;
	int point;
	
	public Member(String name, String id, int point) {
		this.name = name;
		this.id = id;
		
	}
	
}
