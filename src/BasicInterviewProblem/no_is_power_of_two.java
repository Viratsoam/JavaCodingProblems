package BasicInterviewProblem;

import java.util.Scanner;

public class no_is_power_of_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(checkNum(n)){
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
public static boolean checkNum(int n)
{
	if(n==0)
	{
		return false;
	}
	while(n!=1)
	{
		if(n%2!=0)
		{
			return false;
		}
		n= n/2;
	}
	return true;
}
}
