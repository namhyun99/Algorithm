package javaprac.level1;

public class Ex04 {
	/*
	 * 핸드폰 번호 가리기
	 * 
	 * ▼문제설명
	 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	 * 전화번호가 문자열 phone_number로 주어졌을 때, 
	 * 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, 
	 * solution을 완성해주세요.
	 * 
	 * ▼제한조건
	 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
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

	// 출력테스트
	public static void main(String[] args) {
		
		Ex04 ex4 = new Ex04();
		System.out.println(ex4.solution("01033334444"));
		System.out.println(ex4.solution("027778888"));

	}

}
