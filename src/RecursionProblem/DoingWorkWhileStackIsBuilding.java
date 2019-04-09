package RecursionProblem;

import java.util.Scanner;

public class DoingWorkWhileStackIsBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		first(n);
	}
public static void first(int n)
{
	if(n==0)
	{
		return ;
	}
	if(n%2!=0) {
	System.out.println(n);
	}
	first(n-1);
	if(n%2==0) {
	System.out.println(n);
	}
}
}
