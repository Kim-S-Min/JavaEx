package com.javaex.basic2;

import java.util.Scanner;
public class ConditionalEx {
	public static void main(String[] args) {
	//	ifEx();	
	//	ifElseEx();
	//	ifPractice();	//	연습문제
	//	switchEx();	//	연습문제
	//	switchEx2();	//	연습문제
	//	switchEx3();	//	연습문제
	ifPractice02();
		
	}
	//	연습문제	//	점수를 입력받아 입력된 수가 3의 배수인지 판별하는 프로그램을 작성하시오
	private static void ifPractice02() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int score = scanner.nextInt();
		/*
		if (score % 3 == 0) {
			System.out.println(score + "은(는) 3의 배수입니다");
		} else {
			System.out.println(score + "은(는) 3의 배수가 아닙니다");
		}
		*/
		System.out.println(score + "는 " + (score % 3 == 0 ? "3의 배수입니다": "3의 배수가 아닙니다"));
		scanner.close();
		
		
	}
	//	연습문제	//	switch ~ case	//	각 요일별로 메세지를 출력해보시오
	private static void switchEx3() {
		String day = "TUE";
		String message;	//	결과 변수
		//	요일 변수 : 지정된 범위의 값만 들어와야 한다
		//	문자열 사용을 자제하고 -> enum 데이터 타입으로 변경하는게 좋다
		
		switch(day) {
		case "SUN":
			message = "일요일";
			break;
		case "MON":
		case "TUE":
		case "WED":
		case "THU":
			message = "열공";
			break;
		case "FRI":
			message = "불금";
			break;
		case "SAT":
			message = "주말";
			break;
		default:
			message = "?";
		}
		
		System.out.println(day + "에는" + message);
		
		
	}
	//	연습문제	//	switch ~ case	//	월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하시오
	private static void switchEx2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일 입니다");
			break;	//	잊으면 한번에 다 출력된다 (잊지말자)
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 입니다");
			break;
		case 2:
			System.out.println(month + "월은 28일 입니다");
			break;
		default:	//	만약을 대비해서 만들어 두자 ex)0,13 기타 등등
			System.out.println("?");
		}
		
		scanner.close();
		
		
	}
	//	연습문제	//	switch ~ case
	private static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요 \n (1.자바 2.C 3.C++ 4.파이썬)");
		
		int code = scanner.nextInt();
		
		switch (code) {
		case 1:	//	code == 1
			System.out.println("R101호 입니다.");
			break;	//	case와 break는 한묶음으로 생각하자.\
		case 2:	//	code == 2
			System.out.println("R202호 입니다.");
			break;
		case 3:	//	code == 3
			System.out.println("R303호 입니다.");
			break;
		case 4:	//	code = =4
			System.out.println("R404호 입니다.");
			break;
		default:	//	마지막 else
			System.out.println("관리자에게 문의하세요.");
		}
		
		scanner.close();
		//	이 아래부터는 scanner의 메서드를 사용할 수 없다
		//	만약 break를 미사용한다면 ex) 2번을 선택한다면 (2~else)까지 한번에 다 출력된다.
		
		
	}
	//	연습문제	//	과목먼호를 입력받아 강의실 번호를 출력하는 프로그램을 작성하시오
	private static void ifPractice() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("과목을 선택하세요. \n (1.자바 2.C 3.C++ 4.파이썬)");
		int num = scanner.nextInt();
		
		if (num == 1) {
			System.out.println("R101호 입니다.");
		} else if (num == 2) {
			System.out.println("R202호 입니다.");
		} else if (num == 3) {
			System.out.println("R303호 입니다.");
		} else if (num == 4) {
			System.out.println("R404호 입니다.");
		} else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		scanner.close();
		
		
	}
	//	if ~ else if ~ else 문
	private static void ifElseEx() {
		//	숫자를 입력받아 숫자가 0보다 크면 양수 0보다 작으면 음수 0일때는 0을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = scanner.nextInt();	//	정수입력
		
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		//	중첩 if : if문은 중첩될 수 있다
		if (num == 0) {
			System.out.println("0입니다.");
		} else {	//	!=0
			if (num > 0) {
				System.out.println("양수입니다.");
			} else {
				System.out.println("음수입니다.");
			}
		}
		
		//	if문의 중첩이 3단계 이상일때 => 코드가 제대로 되있는지 의심해보자.
		scanner.close();
		
		
	}
	//	if 분기문
	private static void ifEx() {
		//	점수를 입력받아 점수가 60점 이상이면 "합격입니다" 출력
		//	60점 미만일때 "불합격입니다" 출력
		Scanner scanner = new Scanner(System.in);	//	기본적인 조건분기문
		System.out.println("점수를 입력하세요 : ");
		int score = scanner.nextInt();
		
		//	조건분기
		if (score >= 60) {
			System.out.println("합격입니다.");	//	true일 경우 출력
		} else {
			System.out.println("불합격입니다.");	//	false일 경우 출력
		}
		
		scanner.close();
		
		
	}
}
