package javaprac.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex10 {

	/*
	 * ���� ���� �� �����ϱ�
	 * 
	 * �幮������ ������ ������ �迭, arr���� ���� ���� ���� ������ �迭�� �����ϴ� �Լ�, solution�� �ϼ����ּ���. ��, �����Ϸ���
	 * �迭�� �� �迭�� ��쿣 �迭�� -1�� ä�� �����ϼ���. ������� arr�� [4,3,2,1]�� ���� [4,3,2]�� �����ϰ�, [10]��
	 * [-1]�� �����մϴ�.
	 */

	public int[] solution(int[] arr) {
		
		int[] temArr = arr.clone();
		Arrays.sort(temArr);
		int min = temArr[0];

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min)
				list.add(arr[i]);
		}

		int[] answer = {};
		if (list.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}

		return answer;

	}

	public static void main(String[] args) {

		Ex10 ex10 = new Ex10();

		int[] arr1 = { 4, 3, 2, 1 };
		int[] arr2 = { 10 };

		System.out.println(Arrays.toString(ex10.solution(arr1))); // [4,3,2]
		System.out.println(Arrays.toString(ex10.solution(arr2))); // [-1]

	}

}
