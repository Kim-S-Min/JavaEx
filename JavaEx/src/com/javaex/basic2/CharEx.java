package com.javaex.basic2;

//	char(2byte)
//	문자열 char은 작은따음표(')를 사용해야 한다.
public class CharEx {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = '한';
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1 + c2);	/*	c1,c2를 연산자를 이용해 합친다면 문자로 출력되는 것이 아닌 수치로 출력이 된다.
		System.out.println(c1 - c2);	*/
		
		String str = "A한";	//	String str = "?"를 한다면 String으로 str을 변경불가능한 "?"로 지정하는것
		System.out.println(str);	//	출력된다면 str은 "A한"이라는 변경불가능한 문자(수치)로 바뀐다.
		
		
	}
}
