package com.javaex.basic2;

//	char(2byte)
//	�����ڵ� ĳ���� 1����
public class CharEx {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '한';
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1 + c2);	//	c1,c2�� int�� ��ȯ�ǰ� +�� �������� �ٲ�
		
		String str = "A한";	//	String�� char�� ����� �ڷ� ����
		System.out.println(str);	//	"A��"�� ���� �״�θ� �����
		
	}
}
