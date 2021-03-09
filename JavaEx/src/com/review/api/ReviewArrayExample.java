package com.review.api;

import java.util.Arrays;

public class ReviewArrayExample {
	//	배열을 조작하는 기능을 가진 API이다
	//	복사, 항목정렬, 항목검색
	public static void main(String[] args) {
		arrayCopyEx();
		
		
		
	}
	//	배열의 복사
	private static void arrayCopyEx() {
		//	회고
		char[] src = "Java Programming".toCharArray();
		System.out.println("원본: " + Arrays.toString(src));
		
		//	System을 이용한 복사
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);	//	순서대로
			//	원본의배열의, 시작인덱스, 타켓배열, 복사시작위치, 복사할길이
		System.out.println("System을 이용한 복사: " + Arrays.toString(target));
		
	}
}
