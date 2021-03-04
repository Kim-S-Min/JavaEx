package com.javaex.practice01;

//1. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다
//- 입력이 7이면 (1+3+5+7 = 16)
//2. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다
//- 입력이 10이면 (2+4+6+8+10 = 30)

import java.util.Scanner;
public class Problem06 {
public static void main(String[] args) {
	//	Problem06();	//	내가 만든식
	Problem006();	//	강사님이 만든식
	
	}

	private static void Problem006() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		int startNum = (num % 2 == 0) ? 2:1;
		int sum = 0;
		
		for (int i = startNum; i <= num; i+= 2) {
			sum += i;
		}
		System.out.println("결과:" + sum);
		scanner.close();
		
	}
	private static void Problem06() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();


		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 2 == 0) {
				num1 = num1 + i;
			} else {
				num2 = num2 + i;
			} 
		}
		System.out.println("결과값은 : " + num1);
		System.out.println("결과값은 : " + num2);
		scanner.close();

	}
}
