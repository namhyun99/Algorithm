package javaprac.level1;

public class Ex11 {
	
	/*
	 * ���� ������ �Ǻ�
	 * 
	 * �幮�� ����
	 * ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
	 * n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�,
	 * n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	 * 
	 * ������ ����
	 * n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
	 * 
	 * �� ����� ��
	 * ����� ��#1
	 * 121�� ���� ���� 11�� �����̹Ƿ�, (11+1)�� ������ 144�� �����մϴ�.
	 * ����� ��#2
	 * 3�� ���� ������ ������ �ƴϹǷ�, -1�� �����մϴ�.
	 *
	 */
	
    public long solution(long n) {
    	
    	long answer = 0;
    	Double x = Math.sqrt(n);
    	   	   	
    	if( x == x.intValue()) {
    		answer = (long) Math.pow(x + 1, 2);    		
    	} else {
    		answer = -1;
    	}
    	
        return answer;
    }

    
    //��� �׽�Ʈ
	public static void main(String[] args) {
		
		
		Ex11 ex11 = new Ex11();
//      System.out.println(ex11.solution(121));
		System.out.println(ex11.solution(3));
	}

}
