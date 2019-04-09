package BasicInterviewProblem;

import java.util.Scanner;

public class Anybase_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Current base to convert into Decimal: ");
		int n = sc.nextInt();
		System.out.println("Enter the number you want to convert into decimal: ");
		int n1 = sc.nextInt();
		int dec = 10;
		//any_to_dec(n1, n, dec);
		Any_to_d(n1,n,dec);
	}
 public static void any_to_dec(int n,int cbase, int dec)
 {
	 int rem,sum,i=0,ans=0;
	 while(n!=0)
	 {	
		 rem = n % dec;
		 sum = rem*power(cbase,i);
		 ans = ans + sum;
		 i++;
		 n = n/10;
	 }
	 System.out.println(ans);
 }
 
 public static int power(int num,int p)
 {
	 int n = 1;
	 while (p!=0)
	 {
		 n= n * num;
		 p--;
	 }
	 return n;
 }
 public static void Any_to_d(int num, int cbase, int dec)
 {
	 int multiply = 1;
	 int output=0;
	 while(num!=0)
	 {
		 int rem = num % 10;
		 int ans = rem * multiply;
		 multiply = multiply * cbase;
		 output = output + ans;
		 num = num / 10;
	 }
	 System.out.println(output);
 }
}
