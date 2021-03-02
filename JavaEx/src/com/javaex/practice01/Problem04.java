package com.javaex.practice01;

public class Problem04 {
	public static void main(String[] args) {
		for (int a = 0; a <= 9; a++) {
			for (int b = 1; b <= 10; b++) {
				System.out.print(String.format("%2d", a + b));
				System.out.print(" ");
			}
			System.out.println();
		} 
	}
}
