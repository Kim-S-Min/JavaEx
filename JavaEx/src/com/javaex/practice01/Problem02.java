package com.javaex.practice01;

//	숫자를 입력받아 아래와 같이 출력하세요
/* 4
 * 1
 * 22
 * 333
 * 4444
 */
import java.util.Scanner;	//	이 명령어가 있어야 scanner가 정상 작동한다?
public class Problem02 {
	public static void main(String[] args) {
		problemEx02();
		
		
	}
	private static void problemEx02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		int rowCount = num;
		
		
		for (int row = 1; row <= rowCount; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(num);	//	여기서 출력을 1 22 333 4444 로만 하면 되는데 어떻게 해야할지 모르겠다
			}
			System.out.println();
		}	
	}
	
	
}
