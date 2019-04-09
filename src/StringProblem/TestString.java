package StringProblem;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String a = str1;
	//	str1 = "Bye";
		//System.out.println(str1);
			SubS(str1); // Substring
	}
public static void SubS(String str1)
{
	for(int i=0;i<str1.length();i++)
	{		String str ="";
			char ch1 = str1.charAt(i);
			System.out.println(ch1);
			str = str + ch1;
		for(int j=i+1;j<str1.length();j++)
		{	
			char ch = str1.charAt(j);
			str = str + ch;
			System.out.println(str);
		}
		str ="";
	}
}
}
