package BasicInterviewProblem;

import java.util.Scanner;

public class FactorialTraillingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int count = 0;
		for (int i = 5; n / i >= 1; i *= 5)
		{
            count += n / i;
		}
		System.out.println(count);
	}
}
