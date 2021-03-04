package com.review.oop;


public class MethodReviewExample {
	public static void main(String[] args) {
		printDivide(5 , 0);	//	내가 원하는 숫자를 넣는다.	//	scanner는 콘솔에 입력
		double result = getSum(4 , 5);
		System.out.println("4 + 5 = " + result);
		
		System.out.println("getSum : " + getSum(new double[] {
				1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		}));	//	이렇게 하면 모든 수의 합이 출려된다
		
		System.out.println("getSumMany : " + getSumMany(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		//	이렇게 하면 모든 수의 합이 출력된다
		//	getSum과 getSumMany의 값이 같게 나오지만 가독성과 식을 줄으로서 훨씬 깔끔하게 같은 값을 낼수있다
	}
	//	가변인수 : ....
	private static double getSumMany(double ... values) {
		return getSum(values);
	}
	//	매개변수의 개수를 모를때 -> 배열이용
	private static double getSum(double[] values) {
		double total = 0;
		for (double value : values) {
			total += value;
		}
		return total;	//	이렇게 하면 return은 double과 연결이 된다
	}
	//	반환값을 받고자 한다면 리턴 타입을 지정해줘야 한다
	private static double getSum(double num1, double num2) {
		return num1 + num2;	//	반드시 지정한 리턴타입과 동일해야 반환값을 받을 수 있다
	}
	//	반환 값(return)이 없을 경우 void 타입을 지정한다
	private static void printDivide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0으로는 나눌 수 없습니다.");
			return;	//	return은 void와 연결이 되있기 때문에 return이 나온 시점에서 뒤 문장은 무시되고
					//	void의 위치로 돌아가서 다시 내려온다
		}
		System.out.println(num1 / num2);
	}
}
