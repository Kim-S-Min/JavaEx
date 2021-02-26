package com.javaex.basic.types;

public class ConsoleEx {

	public static void main(String[] args) {
		consoLeOutputEx();
	}
	
	//	콘솔 출력
	private static void consoLeOutputEx() {
		//	표준 출력(stdout) : System.out
		//	표준 에러(stderr) : System.err
		//	메서드 print() -> 출력 후 개행을 하지 않음
		//	메서드 println() -> 출력 후 개행
		//	printf() -> 포맷 출력 -> String 항목에서 정리
		
		System.out.print("Hello");	//	개행 안함
		System.out.println(" Java");	//	개햄함
		System.out.println("New Line");
		
		//	이스케이프 문자
		// \n(개행, \t(탭), \"(큰따음표), \\(역슬래쉬)
		System.out.println("Hello \nJava");	//	강제 개행
		System.out.println("Hello \tJava");	//	탭
		System.out.println("Hello \"Java\"");	//	큰 따음표를 넣을수 있다(앞뒤로 다 넣어야 한다)
		
		String filePath = "E:\\KSM_workspace"; // 역슬래쉬 두번을 해야 한다(파일에 한개씩만 들어가 있다)
		System.out.println(filePath);
		
		
	}
}
