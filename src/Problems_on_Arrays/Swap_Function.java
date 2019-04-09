package Problems_on_Arrays;

import java.util.Scanner;

public class Swap_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		swap1(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static int[] swap1(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1;j<a.length;j++)
			{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			}
		}
		return a;
	}
}
