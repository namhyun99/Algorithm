package java.level1.prac;


/*
 * �幮������
 * ���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
 * ��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
 * ��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� * ���� ���� ���ڿ��� 
 * �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 * 
 * ����������
 * phone_number�� ���� 4�̻�, 20������ ���ڿ� �Դϴ�.
 */

public class Ex4 {
	
	public String solution(String phone_nember) {
		
		
		String answer = phone_nember.replaceAll(phone_nember, "4");
		
		System.out.println(answer);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Ex4 ex4 = new Ex4();
		
		ex4.solution("01033334444");
		
	}

}
