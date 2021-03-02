package com.review;

//	https://emflant.tistory.com/133 에서 참고
//	byte의 저장값?(-128~127)을 무시하고 다른 숫자를 출력하고 싶을땐
public class ReivewByte {
	public static void main(String[] args) {
		int n = 150;
		System.out.println(Integer.toBinaryString(n));	//	returns 10010110
		//	byte는 127을 넘어서는 숫자 부터는 음수로 표현된다
		//	int형 숫자(10010110)에서 맨앞 비트가 1이므로 음수 -106으로 출력됨
		//	여기서 변함없는 것은 (10010110)이다
		
		byte b = (byte) n;
		System.out.println(b);	//	returns -106
		System.out.println(b & 0xff);	//	return 150
		System.out.println(Integer.toBinaryString(b & 0xff));	//	return 10010110
		//	0xff(255)는 int형 이고 10010110은 byte형인데 연산전에 byte가 int형으로 형변환 된다
		//	int는 4byte 데이터형식이며 32비트중 뒤에서 8번째비트가 1이라고 마이너스로 인식되지 않는다
		//	byte로 식을 만들고 (-128~127)이외의 숫자를 사용하고 싶으면 형변환을 이용해라.
		
		
	}
}
