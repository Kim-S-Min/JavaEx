package com.javaex.api.stringclass;

	//	String class
public class StringEx {
	public static void main(String[] args) {
		//	StringBasic();
		//	usefulMethods();
		stringBufferEx();
		
	}
	private static void stringBufferEx() {
		//	String이 불변 객체, StringBuffer는 가변 객체(내부 데이터를 변경할 수 있다)
		StringBuffer sb = new StringBuffer("This");
		
		//	문자열을 뒤에 추가하기 : append	//	this뒤에 원하는 내용을 출력할 수 있다
		sb.append(" is pencil");
		
		//	문자열 삽입 : insert	//	문자열 중간에 원하는 내용을 넣을 수 있다
		sb.insert(8,  "my");
		
		//	문자열 치환 : replace
		sb.replace(8, 10, "your  ");	//	뒤로 스페이스바를 넣어야 your 에서 띄어지고 pencil이 출력된다
		
		System.out.println("최종 문자열: " + sb);
		
		//	버퍼 길이 변경 : setLength	//	버퍼의 길이를 조정해 출력내용을 정할 수 있다
		sb.setLength(10);
		System.out.println("버퍼 조정: " + sb);
		
		//	메서드 체이닝 기법	//	자바를 사용할때 고급비법으로 많이 사용하니 주의하자
		String s = new StringBuffer("this")
						.append(" is pencil")	//	스페이스바 유무에 따라서 출력이 오류가 날 수 있다
						.insert(8, "my")
						.replace(8, 10, "your ")
						.toString();
		System.out.println("메서드 체이닝: " + s);
		
		
	}
	private static void usefulMethods() {
		//	String 다양한 메서드들
		String source = "Java Programming, JavaScript Programming";
		System.out.println("원본: " + source);
		
		//	인덱스 전급
		System.out.println("length: " + source.length());
		System.out.println("5번 인덱스의 글자: " + source.charAt(5));
		
		//	변환 메서드
		System.out.println("모두 소문자: " + source.toLowerCase());
		System.out.println("모두 대문자: " + source.toUpperCase());
		
		//	검색 메서드 (중요)
		int index = 0;
		index = source.indexOf("Java");
		System.out.println("1st Search: " + index);
		
		index += "Java".length();	//	인덱스를 4글자 뒤로 이동
		index = source.indexOf("Java",
				index);	//	검색 시작 인덱스
		System.out.println("2nd Search: " + index);
		index = source.indexOf("Java", index + "Java".length());
		System.out.println("3nd Search: " + index);	//	검색할 내용이 없을 때 -> -1을 출력한다
		
		index = source.lastIndexOf("Java");
		System.out.println("역방향 검색: " + index);
		
		//	추출
		System.out.println("18번 인덱스 ~:" + source.substring(18));	//	끝까지
		System.out.println("18 ~ 21: " + source.substring(18, 22));	//	18 ~ (22 -1)
		
		//	치환메서드
		System.out.println("Replace: " + source.replace("Java", "Python"));	//	replace를 사용해서 출력이미지를 바꿀수 있다
		
		//	변환, 치환, 추출 메서드들은 수행을 해도 원본이 변경되지는 않는다
		System.out.println("원본: " + source);	//	 String 불변 객체(immutable)
		
		//	Whitespace 제거
		String str = "               Hello                  ";
		System.out.println("trim: [" + str.trim() + "]");	//	trim을 이용하면 앞뒤에 있는 공백문자들을 모두 지워준다.
		
		//	문자열 분절
		String words[] = source.split(" ");	//	공백을 기준으로 문자열 분리 -> 배열
		
		for (String data: words) {
			System.out.println("chunk: " + data);
		}
		
		//	문자열의 비교
		//	compareTo : 앞뒤에 숫자나 글자가 같은면 0 작으면 -1 크면 1
		System.out.println("ABC".compareTo("ABD"));
		System.out.println("ABC".compareTo("ABC"));
		
	}
	
	private static void StringBasic() {
		String s1 = "Java"; //	= 리터럴 이라 부른다
		String s2 = new String("Java");	//	새로운 객체
		String s3 = "Java";	//	리터럴
		
		System.out.println("s1, s2 같은 객체 ? " + (s1 == s2));
		System.out.println("s1, s3 같은 객체 ? " + (s1 == s3));
		
		//	String은 Char의 집합이다
		char letters[] = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		
		System.out.println("s4 = " + s4);
		
		//	valueOf 메서드 -> 기본 타입을 문자열로 변환한다
		String s5 = String.valueOf(3.14159f);
		System.out.println("s5 = " + s5);
	}
	
	
}