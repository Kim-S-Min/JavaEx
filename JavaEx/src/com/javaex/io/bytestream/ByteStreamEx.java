package com.javaex.io.bytestream;


import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
public class ByteStreamEx {

	public static void main(String[] args) {
		//  입력소스
		byte input[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		//	목적지
		byte output[] = null;
		
		System.out.println("원본: " + Arrays.toString(input));	//	read하면 0 -> 1 ->2로 하나씩 넘어간다
		//	스트림 열기
		InputStream bis = null;
		OutputStream bos = null;
		
		 try {
			 bis = new ByteArrayInputStream(input);
			bos = new ByteArrayOutputStream();
		
			//	입력을 위한 변수
			int data = 0;	//	io 를 사용할때는 체크드 를 예외 처리해야 한다
			
			while((data = bis.read()) != -1) {	//	읽을 데이터가 없으면 -1을 출력한다
//				data = bis.read();	//	데이터는 1바이트씩 읽어온다
				System.out.println("읽은 데이터 : " + data);	
				//	OutputStream으로 출력
				bos.write(data);
			}
			
			//	타겟 배열로 출력
			output = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("Output출력: " + Arrays.toString(output));
		} catch (IOException e) {
			//	IO 예외 처리
			e.printStackTrace();
			
			
		} finally {	//	자원의 정리
//			if (bos != null)
//			bos.close();
//			if (bis != null)
//			bis.close();
			try {
				bos.close();
				bis.close();
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
