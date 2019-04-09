package BasicInterviewProblem;

public class reverse_of_input_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello_World_vikas";
		reverse(str);
	}

	public static void reverse(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '_') {
				str1 = str1 + str.charAt(i);
			}else {
				for(int j=str1.length()-1;j>=0;j--)
				{
					System.out.print(str1.charAt(j));
				}
				str1="";
				System.out.print("_");
			}
		}
		for(int j=str1.length()-1;j>=0;j--)
		{
			System.out.print(str1.charAt(j));
		}

	}
}
