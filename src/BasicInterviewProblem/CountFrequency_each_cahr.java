package BasicInterviewProblem;

import java.util.*;

public class CountFrequency_each_cahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		count(str);
	}

	public static void count(String str) {
		int k = 0;
		int i = 0;
		int num=0;
		while(i<str.length())
		{
			int counter = 0;
			char ch = str.charAt(num);
			for(int j=num;j<str.length();j++)
			{
				
				if(ch == str.charAt(j))
				{
					counter++;
				}
				else
				{
					num = j;
					break;
				}
				}
			i =i+counter;
			if(ch!=' ') {
			System.out.print(ch);
			if(counter>1) {
			System.out.print(counter);
			}
			}
			else
			{
				System.out.print(" ");
			}
		}

	}
}
