package RecursionProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> output = GetP(str);
		// System.out.println(GetP("abc"));
		String[] ans = output.toArray(new String[output.size()]);
		Arrays.parallelSort(ans);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
			if (i < ans.length - 1) {
				System.out.print(",");
			}
		}
	}

	public static ArrayList<String> GetP(String str) {

		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rr = GetP(ros);
		ArrayList<String> mr = new ArrayList<>();
		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				String val = rrs.substring(0, i) + ch + rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
	}

}
