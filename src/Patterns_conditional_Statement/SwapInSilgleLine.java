package Patterns_conditional_Statement;

public class SwapInSilgleLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 12;
		a = a + b - (b=a);
		System.out.print(a + " "+ b);
	}

}
