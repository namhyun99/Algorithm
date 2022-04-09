package javaprac.level1;

import java.util.Arrays;

public class Ex02 {
	/*
	 * x��ŭ ������ �ִ� n���� ����
	 * 
	 * �幮������
	 * �Լ� solution�� ���� x�� �ڿ��� n�� �Է¹޾�
	 * x���� ������ x�� �����ϴ� ���ڸ� n�� ������ ����Ʈ�� �����ؾ��մϴ�.
	 * ���� ���� ������ ����, ������ �����ϴ� �Լ�,
	 * solution�� �ϼ��� �ּ���.
	 * 
	 * ����������
	 * x�� -10000000 �̻�, 10000000 ������ �����Դϴ�.
	 * n�� 1000 ������ �ڿ����Դϴ�.
	 * 
	 */
	
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i] = (long)(i+1) * 2;
		}
		return answer;
	}
	
	// ��� �׽�Ʈ
	public static void main(String[] args) {
		
		Ex02 ex2 = new Ex02();
		long[] result = ex2.solution(2, 5);
		System.out.println(Arrays.toString(result));

	}

}
