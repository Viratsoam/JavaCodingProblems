package Patterns_conditional_Statement;

import java.util.Scanner;

public class Sum_first_natural_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n != 0) {
			sum += n;
			n--;
		}
		System.out.println(sum);
	}

}
