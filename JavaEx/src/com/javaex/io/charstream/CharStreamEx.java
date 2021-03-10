package com.javaex.io.charstream;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "myFile.txt";
	
	public static void main(String[] args) {
//		writeTextEx();
		readTextEx();
		
	}
	private static void readTextEx() {
		Reader reader = null;
		
		try {
			reader = new FileReader(filename);	//	문자열로 된 것을 정수형으로 바꿔서 출력했다
			
			int data = 0;	//	int(4byte) -> char(2byte)
			while((data = reader.read()) != -1) {
				System.out.print((char)data);	//	data를 char로 출력해야 하기 때문에 정수형에서 char를 입력 해야 한다
//				System.out.print(data);	//	이걸로 출력을 하면 정수형으로 나오기 때문에 위와 같이 출력을 해야 정상 출력이 된다
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다...");
		} catch (IOException e) {
			
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				
			}
		}
		
		
	}
	//	텍스트 파일 만들기
	private static void writeTextEx() {
		//	문자 기반 출력 스트림의 최고 조상은 write이다
		Writer writer = null;
		
		try {
			writer = new FileWriter(filename);
			
			System.out.println("파일을 열었습니다.");
			writer.write("Bit Computer\r\n");
			writer.write("Java Programming\r\n");
			writer.write("2021, 03");
			System.out.println("파일을 기록했습니다.");
			
			
			//	내부 버퍼 비우기
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
				
			}
		}
		
		
	}
}
