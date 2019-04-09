package Patterns_conditional_Statement;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// pattern1(n);
		// pattern2(n);
		// pattern3(n);
		// pattern4(n);
		// pattern5(n);
		// pattern6(n);
		// pattern7(n);
		// pattern8(n);
		// pattern9(n);
		// pattern10(n);
		pattern11(n);

	}
public static void pattern11(int n)
{
	for(int i=0;i<n;i++)
	{
		if(i<= (n/2)-1)
		{
			for(int j=(n/2)-1;j>=i;j--)
			{
				System.out.print("*"+" ");
			}

			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
		
		}
		else if(i >= (n/2)+1)
		{
			for(int j=(n/2)+1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
		}
		else
		{
			System.out.print(" ");
		}
		System.out.println();
	}
}

	public static void pattern10(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void pattern9(int n) {
		int k = 0;
		for (int i = n; i > 0; i--) {
			int n1 = k;
			while (k != 0) {
				System.out.print(" ");
				k = k - 1;
			}

			for (int j = 2 * i - 1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			k = n1 + 1;
		}
	}

	public static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = n; j > i; j--) {
				System.out.print("*" + "");
			}
			System.out.println();
		}
	}

	public static void pattern4(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void pattern3(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	public static void pattern1(int n) {
		while (n > 0) {
			System.out.println("*");
			n--;
		}
	}

	public static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
