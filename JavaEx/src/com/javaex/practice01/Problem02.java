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
		//	int rowcount는 의미가 없기 때문에 모두 삭제
		
		for (int row = 1; row <= num; row++) {	//	rowCount -> num
			for (int col = 1; col <= row; col++) {
				System.out.print(row);	//	col -> row
			}
			System.out.println();
		}	
		scanner.close();	//	scanner는 사용하면 마지막에 항상 닫아야 한다
		
		
	}
	
	
}
