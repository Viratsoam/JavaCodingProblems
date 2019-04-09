package BasicInterviewProblem;

public class Smallest_in_Three_Without_comparison_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12, n1 = 5, n2 = 7;
		int i = 0;
		while (n != 0 || n1 != 0 || n2 != 0) {
			n--;
			n1--;
			n2--;
			i++;
		}
		System.out.println(i);
	}

}
