package BasicInterviewProblem;

import java.util.Scanner;

public class UpparCase_LowerCase_characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to print the number of CharCharters:");
		int n = sc.nextInt();
		char ch1[] = new char[n];
		String str="";
		String capital ="";
		String small = "";
		for(int i=0;i<n;i++)
		{
			ch1[i]= sc.next().charAt(0);
			str = str + ch1[i];
		}
		for( int j=0;j<str.length();j++)
		{
			if(str.charAt(j)>=65 && str.charAt(j)<=90)
			{
				capital = capital + str.charAt(j);
			}
			else
			{
				small = small + str.charAt(j);
			}
		}
		System.out.println("Capital letters are: "+ capital);
		System.out.println("Small letters are: "+ small);

	}

}
