package RecursionProblem;

import java.util.Scanner;

public class IsArraySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[]= {12,13,14,15,16,17,28};
		int si = 0;
		System.out.println(isSorted(a,si));
	}
	public static boolean isSorted(int a[],int si)
	{
		if(si==a.length-1)
		{
			return true;
		}
		if(a[si]>a[si+1])
		{
			return false;
		}
		boolean ans =isSorted(a,si+1);
		return ans;
	}
}
