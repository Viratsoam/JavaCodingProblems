package RecursionProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> output = getSS(str);
		String[] ans = output.toArray(new String[output.size()]);
		for(int i =0;i<ans.length;i++)
		{
			System.out.print(ans[i]);
			if(i<ans.length-1)
			{
				System.out.print(",");
			}
		}
	}
public static ArrayList<String> getSS(String str)
{
	if(str.length()==0)
	{
		ArrayList<String> base = new ArrayList<>();
		base.add("");
		return base;
	}
	
	char ch = str.charAt(0);
	String ros = str.substring(1);
	ArrayList<String> result = new ArrayList<String>();
	ArrayList<String>  recResult = getSS(ros);
	for(int i=0;i<recResult.size();i++)
	{
		result.add(recResult.get(i));
		result.add(ch + recResult.get(i));
	}
	return result;
}
}
