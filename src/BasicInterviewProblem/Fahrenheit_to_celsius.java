package BasicInterviewProblem;

public class Fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fmin = 0;
		int fmax = 300;
		int fstep = 20;
		int c;
		while(fmax>=0)
		{
			c = (int) ((5.0/9)*(fmin-32));
			System.out.println(fmin +" "+ c);
			fmin = fmin + fstep;
			fmax = fmax - fstep;
		}

	}

}
