package Patterns_conditional_Statement;

import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = -1;
		int b = 1;
		//System.out.print(a + " " + b + " ");
		while (n >= 0) {
			int b_old = b;
			b = a + b;
			a = b_old;
       System.out.print(b +" ");
       n--;
		}
	}

}
