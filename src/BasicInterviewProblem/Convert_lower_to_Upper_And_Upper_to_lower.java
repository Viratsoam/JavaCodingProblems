package BasicInterviewProblem;

import java.util.Scanner;

public class Convert_lower_to_Upper_And_Upper_to_lower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String st1 = "";
		for (int i = 0; i < str.length(); i++) {
			int temp = 0;
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				temp = (int) str.charAt(i);
				temp = temp + 32;
				st1 = st1 + (char) temp;
			} else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				temp = (int) str.charAt(i);
				temp = temp - 32;
				st1 = st1 + (char) temp;
			} else {
				st1 = st1 + str.charAt(i);
			}
		}
		System.out.print(st1);
	}

}
