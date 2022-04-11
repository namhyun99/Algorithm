package javaprac.level1;

import java.util.Arrays;

public class Ex08 {
	/*
	 * �ִ������� �ִ����� ���ϱ�
	 * 
	 * ��Ŭ���� ȣ���� ����ϱ�
	 */

	public int[] solution(int n, int m) {

		int max = Math.max(n, m); // 12
		int min = Math.min(n, m); // 3
			
		// �ִ� �����
		
		while(min != 0) {
			int r = max % min;  // 0
			max = min;  // max 3
			min = r; // min 0
				
		}
		
		//�ּ� ����� = �μ��� �� / �ִ�����
		
		int gcd = n * m / max;
		
		int[] answer = {max, gcd};
		return answer;
		
	}
	
	

	public static void main(String[] args) {

		Ex08 ex8 = new Ex08();
		
		int[] arr1 = ex8.solution(3, 12);
		int[] arr2 = ex8.solution(2, 5);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

}
