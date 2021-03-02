package com.javaex.practice01;

//	문제 : 1에서 100까지의 수에서 5의 배수 이면서 7의 배수인 수를 출력하시오
public class Problem01 {
	public static void main(String[] args) {
		problemEx01();
		
		
	}
	private static void problemEx01() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 != 0 || i % 7 != 0) continue ;		//	continue는 해당 반복부분을 탈출 후 다음반복을 실행한다
			//	if (i % 5 == 0 || i % 7 == 0) break ;	//	break는 해당 반복부분을 만나는 즉시 전체를 중단한다		//	==로 하게되면 5,7의 배수를 모두 지운다
			System.out.println(i);
		}
		
		
	}
}
