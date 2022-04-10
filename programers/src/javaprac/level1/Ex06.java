package javaprac.level1;

public class Ex06 {
	
	/*
	 * ��� ���ϱ�
	 * 
	 * �幮������
	 * ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
	 * 
	 * �����ѻ���
	 * arr�� ���� 1�̻�, 100������ �迭�Դϴ�.
	 * arr�� ���Ҵ� -10,000�̻� 10,000������ �����Դϴ�.
	 * 
	 */
	
	public double solution(int[] arr) {	
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		
		double answer = (double) sum / arr.length;
		return answer;
	}

	public static void main(String[] args) {

		Ex06 ex6 = new Ex06();
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,5};
		
		System.out.println(ex6.solution(arr1));
		System.out.println(ex6.solution(arr2));
	}

}
