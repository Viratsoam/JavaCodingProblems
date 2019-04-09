package Sortings;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		int n = sc.nextInt();
		int a[]= {22,12,23,24,42,11,13,16};
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.print("Present at Position: "+i);
				break;
			}
		}
		if(i==a.length)
		{
			System.out.println("Element not found");
		}
	}

}
