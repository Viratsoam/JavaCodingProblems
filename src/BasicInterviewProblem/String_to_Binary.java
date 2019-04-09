package BasicInterviewProblem;

import java.util.Scanner;

public class String_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int num = 0;
		for(int i=0;i<str.length();i++)
		{
			num = num + (int)str.charAt(i);
		}
		int multi = 1;
		int result = 0;
		System.out.println(num);
		while(num!=0)
		{
			int rem = num%2;
			int sum = rem*multi;
			multi = multi * 10;
			result = result + sum;
			num = num / 2;
		}
		System.out.println(result);
	}

}
