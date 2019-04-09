package BasicInterviewProblem;

import java.util.Scanner;

public class Any_base_to_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int num = sc.nextInt();  
  System.out.println("Enter the current base:");
  int Pbase = sc.nextInt();
  System.out.println("Enter the base you want to change:");
  int Cbase = sc.nextInt();
 int output1 = Any_base_to_dec(num,Pbase);
 int output2 = Dec_to_any(output1,Cbase);
 System.out.println(output2);
	}
public static int Any_base_to_dec(int num, int Pbase)
{
	int mulltiplyer = 1, output =0;
	while(num!=0)
	{
		int rem = num % 10;
		int sum = rem * mulltiplyer;
		mulltiplyer = mulltiplyer * Pbase;
		output = output + sum;
		num = num / 10;
	}
	return output;
}
public static int Dec_to_any(int num, int Cbase)
{
	int multi = 1, output =0;
	while(num!=0)
	{
		int rem = num % Cbase;
		int sum = rem * multi;
		multi = multi * 10;
		output = output + sum;
		num = num / Cbase;
	}
	return output;
}
}
