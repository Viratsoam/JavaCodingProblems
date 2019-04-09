package BasicInterviewProblem;

import java.util.Scanner;

public class Decimal_to_any_base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println("Enter the change base:");
		int cbase = sc.nextInt();
		
		Dec_to_any_base(num,cbase);
	}
public static void Dec_to_any_base(int num, int cbase)
{
	int multiply = 1;
	int output = 0;
	while(num!=0)
	{
		int rem = num % cbase;
		int ans = rem * multiply;
		multiply = multiply * 10;
		output = output + ans;
		num = num / cbase;
	}
	System.out.println(output);
}
}
