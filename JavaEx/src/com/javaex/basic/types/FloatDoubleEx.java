package com.javaex.basic.types;

//	�Ǽ�
//	float(4) < double(8)
//	���̷θ� �����ϰ� ǥ�� ������ ���� �ڷ���
//	*ǥ�� ���� : byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)* -���߿� Ȯ�� 
public class FloatDoubleEx {
	public static void main(String[] args) {
		float floatVar = 3.14159f;	//	F or f ����
		double doubleVar = 3.14159;	//	�Ǽ��� �⺻�� double�̱⿡ �ƹ��͵� �����ʿ䰡 ����.
		
		int intVar = 30000000;
		floatVar = 3E7f;	//	3X10(7)
		doubleVar = 314159E-5;	//	3.14159 -> X10(-5)
		
		System.out.println("int:" + intVar);
		System.out.println("float" + floatVar);
		System.out.println("double" + doubleVar);
		
		//	�ε��Ҽ��� ����� ������
		//	float, double ���е��� �����ϰ� ǥ�� ������ ���� �ڷ���
		//	���а�꿡 Ȱ��ÿ��� ����
		System.out.println(0.1 * 3);	//	������ ��ǻ�� ������ ���ѵ� byte�� ���� ��¿�� ���� ����
		
	}
}
