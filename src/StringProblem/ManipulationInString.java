package StringProblem;

public class ManipulationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bucky Roberts";
		check(str);
	}
public static void check(String str)
{
	String str1 ="";
	String str2 ="";
	int i,j=0;
	for(i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
		{
			str1 = str1 + str.charAt(i);
		}
		else
		{	j = i;
			break;
		}
	}
	for(int k =j+1;k<str.length();k++)
	{
		str2 = str2 + str.charAt(k);
	}
	int a= 0;
	int b= 0;
	while(a<str1.length() && b<str2.length())
	{
		System.out.print(str1.charAt(a));
		System.out.print(str2.charAt(b));
		System.out.print("_");
		a++;
		b++;
	}
	if(a<str1.length())
	{
		while(a<str1.length())
		{
			System.out.print(str1.charAt(a));
			if(a<=str1.length()-2)
			System.out.print("_");
			a++;
		}
	}
	if(b<str2.length())
	{
		while(b<str2.length())
		{
			System.out.print(str2.charAt(b));
			if(b<=str2.length()-2)
			System.out.print("_");
			b++;
		}
	}
}
}
