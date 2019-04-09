package RecursionProblem;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,13,14,12,12,15,16,19,20};
		ArrayList<Integer>ans=removedup(a);
		for(int val :ans)
		{
			System.out.print(val +" ");
		}
	}
	public static ArrayList<Integer> removedup(int a[])
	{
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer,Boolean> seen = new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(seen.containsKey(a[i]))
			{
				continue;
			}
			output.add(a[i]);
			seen.put(a[i],true);
		}
		return output;
	}
}
