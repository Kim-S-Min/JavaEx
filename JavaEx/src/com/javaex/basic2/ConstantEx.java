package com.javaex.basic2;

//	상수에 대한 연습
//	변경이 불가능하며 상수를 사용하는 문자들은 모두 대문자를 이용해야 한다.
public class ConstantEx {
	static final int SPEED_LIMIT = 100;	//	속도제한을 120으로 설정
	
	public static void main(String[] args) {
		//	final int SPEED_LIMIT = 120;	//	final -> 변경불가능한 상수를 지정함		
		//	��� �������
		//	1.�ڵ��� �������� ���δ�
		//	2.����Ұ� -> �ڵ��� ������ Ȯ��
		int speed = 120;
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("당신의 제한속도를 넘었습니까?" + b1);
		
		System.out.println("현재 제한속도는" + SPEED_LIMIT + "입니다.");
		
		//	SPEED_LIMIT = 100;	//	ó�������� ����� ������ �� ����.
		
	}
}
