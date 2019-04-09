package RecursionProblem;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(power(n,p));
	}
public static int power(int n, int p)
{
	if(p==0)
	{
		return 1;
	}
	int pnm=power(n, p-1);
	return n*pnm;
}
}
