package javaprac.level1;

import java.util.Scanner;

public class Ex01 {
	// 직사각형 별찍기
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a�� �Է� : ");
		int a = sc.nextInt();
		System.out.print("b�� �Է� : ");
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
