package com.javaex.practice01;

//	문제 : 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
import java.util.Scanner;
public class Problem05 {
	public static void main(String[] args) {
		int max = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자:");
			int num = scanner.nextInt();
			
			//	첫번째 입력 값은 그냥 max에 넣자?
			if (i == 1 || num > max) max = num;
		}
		System.out.println("최댓값은 " + max + "입니다.");
		scanner.close();
		
	}
}
/*		Scanner scanner = new Scanner(System.in) ;
*		System.out.println("숫자를 입력하세요.\n숫자1: \n숫자2: \n숫자3: \n숫자4: \n숫자5: ");
*		//	println으로 숫자 1~5 까지의 숫자는 숫자5: 아래로 작성이 되지만
*		//	과제에 있는 숫자1: "??" 처럼은 어떻게 해야 할지를 모르겠다
*		int num1 = scanner.nextInt();
*		int num2 = scanner.nextInt();
*		int num3 = scanner.nextInt();
*		int num4 = scanner.nextInt();
*		int num5 = scanner.nextInt();
*		
*		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
*			System.out.print("최댓값은 " + num1 + "입니다.");
*		}
*		if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
*			System.out.print("최댓값은 " + num2 + "입니다.");
*		}
*		if (num3 > num2 && num3 > num1 && num3 > num4 && num3 > num5) {
*			System.out.print("최댓값은 " + num3 + "입니다.");
*		}
*		if (num4 > num2 && num4 > num3 && num4 > num1 && num4 > num5) {
*			System.out.print("최댓값은 " + num4 + "입니다.");
*		}
*		if (num5 > num2 && num5 > num3 && num5 > num4 && num5 > num1) {
*			System.out.print("최댓값은 " + num5 + "입니다.");
*		}
*	}
*}
*/