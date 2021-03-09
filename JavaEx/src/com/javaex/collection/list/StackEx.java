package com.javaex.collection.list;


import java.util.Stack;
public class StackEx {
	//	Stack자료형
	//	Last Input First Output (LIFO)
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("STACK: " + stack);
		
		//	데이터 제공
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println("STACK: " + stack);
			
			
		}
		//	확인 : 가장 마지막(출력 위치)의 데이터를 확인: 인출은 안한다
		System.out.println("PEEK: " + stack.peek());	//	peek는 가장높고 가장마지막 값만 출력하고 나머지는 제외한다
		System.out.println("STACK: " + stack);
		
		//	인출 : pop
		Integer item = stack.pop();	//	pop은 가장 마지막, 가장 큰값에서 마지막 데이터를 삭제후 출력한다
		System.out.println("POP: " + item);
		System.out.println("STACK: " + stack);
		
		//	순회
//		while(true) {	//	에러가 난다
//			System.out.println("POP: " + stack.pop());
//			System.out.println("STACK: " + stack);
//		}
		while(!stack.empty()) {	//	stack이 비어있지 않다면
			System.out.println("POP: " + stack.pop());
			System.out.println("STACK: " + stack);
		}
	}
	
}
