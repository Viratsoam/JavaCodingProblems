package Patterns_conditional_Statement;

import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int n1 = floorSqrt(n);
		int i;
		for ( i = 2; i <= n; i++) {
			if(n % i == 0)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		if(i==n)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println(" Not Prime");
		}
	}
public static int floorSqrt(int x) 
    { 
        // Base cases 
        if (x == 0 || x == 1) 
            return x; 
  
        // Staring from 1, try all numbers until 
        // i*i is greater than or equal to x. 
        int i = 1, result = 1; 
          
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        return i - 1; 
    } 
  
}
