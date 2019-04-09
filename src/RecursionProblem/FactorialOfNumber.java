package RecursionProblem;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fact(n));
		System.out.println(fact1(n));
	}
public static int fact(int n)
{
	if(n==0 || n==1)
	{
		return 1;
	}
	return n*fact(n-1);
}
public static int fact1(int n)
{
	int n1=1;
	if(n==0)
	{
		return 1;
	}
	while(n!=0)
	{
		n1 = n1*n;
		n--;
	}
	return n1;
}
}
