package javaprac.level1;

public class Ex05 {
	/*
	 * �ϻ��� ��
	 * 
	 * �幮������
	 * ���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�.
	 * ���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 
	 * 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�.
	 * �ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�
	 * solution�� �ϼ��� �ּ���
	 * 
	 * ����������
	 * x�� 1�̻�, 10000������ ����
	 *  
	 */
	public boolean solution(int x) {
		
		// �ڸ��� ���ϱ�
		String str = Integer.toString(x);
		char[] ch = new char[str.length()];
		int sum = 0;
		boolean answer = true;
		
		for(int i= 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
			
		for(int i = 0; i < ch.length; i++) {
			sum += Character.getNumericValue(ch[i]);
		}
		
		// ������
		
		if( x % sum == 0) {
			answer = true;
		} else {
			answer = false;
		}	
		
		return answer;
	}
	

	public static void main(String[] args) {
		
		
		Ex05 ex5 = new Ex05();
		
		System.out.println(ex5.solution(10));
		System.out.println(ex5.solution(12));
		System.out.println(ex5.solution(11));
		System.out.println(ex5.solution(13));
		

	}

}
