package Patterns_conditional_Statement;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the prncpl:");
int P = sc.nextInt();
System.out.println("Enter the Rate:");
int R = sc.nextInt();
System.out.println("Enter the Time:");
int T = sc.nextInt();
float SI = ((P*R*T)/100);
System.out.println("The Simple interest is=> " + SI);

	}

}
