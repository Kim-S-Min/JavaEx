package com.javaex.basic2;

//	���: ������ �ʴ� ��
//	����, �ʱ�ȭ, ��ȸ�� ����, ����Ұ�
public class ConstantEx {
	static final int SPEED_LIMIT = 120;	//	���
	
	public static void main(String[] args) {
		//	final int SPEED_LIMIT = 120;	//	final -> �Ҵ� ���Ŀ��� ����Ұ�
		//	��� �������
		//	1.�ڵ��� �������� ���δ�
		//	2.����Ұ� -> �ڵ��� ������ Ȯ��
		int speed = 120;
		
		boolean b1 = speed > SPEED_LIMIT;
		
		System.out.println("���Ѽӵ��� �ʰ��Ͽ����ϱ�?" + b1);
		
		System.out.println("���Ѽӵ���" + SPEED_LIMIT + "�Դϴ�");
		
		//	SPEED_LIMIT = 100;	//	ó�������� ����� ������ �� ����.
		
	}
}
