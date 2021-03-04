package com.javaex.practice02;

import java.util.Scanner;
public class Problem02 {
	public static void main(String[] args) {
		Problem002();	//	강사님풀이
		Problem02();
		
		
	}
	private static void Problem002() {
		Scanner scanner = new Scanner(System.in);
		
		int values[] = new int[5];
		//	입력 + 저장
		for (int i = 0; i< values.length; i++) {
			values[i] = scanner.nextInt();
		}
		
		//	합산
		int total = 0;
		for (int num:values) {
			total += num;
		}
		
		//	double average = total / values.length;	//	정수와 정수의 계산을 실수로 표현했지만 정수의 값을 실수로 표현했기에 콘솔에 이상하게 출력된다
		double average = (double)total / values.length;	//	실수와 정수를 계산하게 된다면 훨씬 큰 바이트쪽으로 자동 이동되기 때문에 정상 출력된다
		System.out.printf("합계는 %d, 평균은 %.2f%n",total, average);
		
		scanner.close();
		
		
	}
	private static void Problem02() {
		
	}

}
