package com.javaex.collection.list;


import java.util.Queue;
import java.util.LinkedList;
public class QueueEx {
	public static void main(String[] args) {
		//	Queue는 인터페이스, 실체 클래스는 List관련 실체 클래스를 사용한다
		Queue<Integer> queue = new LinkedList<>();
		
		//	데이터제공
		for ( int i = 0; i < 10; i++) {
			queue.offer(i);
			System.out.println("QUEUE: " + queue);
			
			
		}
		//	데이터 확인
		int item = queue.peek();	//	인출은 안된다
		System.out.println("PEEK: " + item);
		System.out.println("QUEUE: " + queue);
		item = queue.poll();	//	데이터 인출
		System.out.println("POLL: " + item);	//	9라는 데이터를 꺼내버림
		System.out.println("QUEUE: " + queue);
		
		//	queue에서 poll을 할 때;
		//	비어있는지 반드시 확인을 해야 한다
		while (!queue.isEmpty()) {
			System.out.println("POLL: " + queue.poll());
			System.out.println("QUEUE: " + queue);
			
			
		}
	}
}
