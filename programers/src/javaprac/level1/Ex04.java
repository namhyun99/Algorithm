package javaprac.level1;

public class Ex04 {
	/*
	 * �ڵ��� ��ȣ ������
	 * 
	 * �幮������
	 * ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
	 * ��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
	 * ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, 
	 * solution�� �ϼ����ּ���.
	 * 
	 * ����������
	 * phone_number�� ���� 4 �̻�, 20������ ���ڿ��Դϴ�.
	 * 
	 */
	
	public String solution(String phone_number) {
		
		String answer = "";
		
		for(int i = 0; i < phone_number.length(); i++) {
			if(i < phone_number.length() - 4)
				answer += "*";
			else
				answer += phone_number.charAt(i);
		}
		
		return answer;
	}

	// ����׽�Ʈ
	public static void main(String[] args) {
		
		Ex04 ex4 = new Ex04();
		System.out.println(ex4.solution("01033334444"));
		System.out.println(ex4.solution("027778888"));

	}

}
