package programers.java.level1.prac;

import java.util.Arrays;

/* �幮������
 * ����� ������ ��� ���� ũ�Ⱑ ���� �� ����� ���� ��, ���� ���� ���� ���� ���� ����� �˴ϴ�.
 * 2���� ��� arr1�� arr2�� �Է¹޾�, ��� ������ �Ӱ���� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
 * 
 * ����������
 * ��� arr1,arr2�� ��� ���� ���̴� 500�� ���� �ʽ��ϴ�.
 *  
 */

public class Ex3 {
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2.length];
        
        for(int i = 0; i < arr1.length; i++) {
        	for(int j = 0; j < arr1[i].length; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j]; 
        	}
        }
                
        return answer;
    }
    
    // ����� ���� ����
    public static void main(String[] args) {
    	
    	Ex3 ex3 = new Ex3();
    	
    	int[][] arr1 = {{1, 2},{2, 3}};
    	int[][] arr2 = {{3, 4},{5, 6}};
    	
    	int[][] temArr = ex3.solution(arr1, arr2);
    	
    	for(int i=0; i < temArr.length; i++) {
    		for(int j=0; j < temArr[i].length; j++) {
    			System.out.print(temArr[i][j] + " ");
    		}
    	}
    	
    	
    	
    }

}
