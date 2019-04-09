package StringProblem;

public class DivideStringEqualParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a_simple_divide_string_quest";
		int n = 4;
		divide(str, n);
	}

	public static void divide(String str, int num) {
		if (str.length() % num != 0) {
			System.out.println("Enter valid size of the String");
		}
		else {
		int d = str.length()/ num;
		int j = 1;
		for (int i = 0; i < str.length(); i++) {
			if (j < d) {
				System.out.print(str.charAt(i));
				j++;
			} else if (j <= d) {
				System.out.println();
				j = 1;
			} else {

			}

		}
		}
	}
}
