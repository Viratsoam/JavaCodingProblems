package BasicInterviewProblem;

import java.util.Scanner;

public class FabbonacciWithTwoVarialble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(fab(n));  // Using Recursion
		int a=0,b=1;
		
		fabonacci(n,a,b);
	}

	public static int fab(int n) {
		
		if (n == 0 || n == 1) {
			
			return  n;
		} 
	   
	   return (fab(n-1) + fab(n-2));
	
	}
	
	public static void fabonacci(int n,int a,int b)
	{
		if(n>=0)
		{
			System.out.print(a+" ");
		}
		if(n>=1)
		{
			System.out.print(b+" ");
		}
		for(int i=2;i<n;i++)
		{
			System.out.print(a+b+" ");
			b = a + b;
			a = b - a;
		}
		
	}

}
