package StringProblem;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 String str1 ="Strings";
 String str2 ="Hello";
 			reverse(str1,str2);
	}
public static void reverse(String s1, String s2)
{
	int i = 0;
	int j = 0;
	while(i<s1.length() && j<s2.length() )
	{
		System.out.print(s1.charAt(i)+""+ s2.charAt(j));
		i++;
		j++;
	}
	if(i != s1.length())
	{
		while(i<s1.length())
		{
			System.out.print(s1.charAt(i));
			i++;
		}
	}
	if(j!=s2.length())
	{
		while(j<s2.length())
		{
			System.out.print(s2.charAt(j));
			j++;
		}
	}
}
}
