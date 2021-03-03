package com.javaex.practice01;

public class Problem03 {
	public static void main(String[] args) {
		for (int i = 1; i  <= 9; i++) {
			for (int num = 1; num <= 9; num++) {
				System.out.print(num + "*" + i + "=" + String.format("%2d", i * num));
				System.out.print("  ");
			}
			System.out.println();

		
		}
		int a = 0;
		while (a++ < 9) {
			int b = 0;
			while (b++ < 9) {
				System.out.print(b + "*" + a + "=" + String.format("%2d", a * b));
				System.out.print("  ");
			}
			System.out.println();
			
			
		}
		
		int h = 1;
		 do {
			int g = 1;
			 do {
				System.out.print(g + "*" + h + "=" + String.format("%2d", h * g));
				System.out.print("  ");
			} while (g++ < 9);
			System.out.println();
		 }while (h++ < 9);
		 
		 for (int num = 1; num <= 9; num++) {
			 for (int dan = 2; dan <= 9; dan++) {
				 System.out.printf("%d*%d=%d\t", dan, num, dan * num);
				 
				 
			 }
			 System.out.println();
			 
			 
		 }
	}
	
	
}
