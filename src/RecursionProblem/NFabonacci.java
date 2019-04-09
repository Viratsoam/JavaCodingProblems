package RecursionProblem;

import java.util.Scanner;

public class NFabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fab(n));
	}
public static int fab(int n)
{
	if(n==0 || n==1)
	{
		return n;
	}
	int fbn1= fab(n-1);
	int fabn2 = fab(n-2);
	return fbn1+ fabn2;
}
}
