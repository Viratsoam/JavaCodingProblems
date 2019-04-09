package Sortings;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = { 23, 12, 11, 32, 24, 22, 13, 21, 25 };
		Bsort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] Bsort(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[i] > a[j + 1]) {
//				int temp = a[i];
//				a[i] = a[j+1];
//				a[j+1]=temp;
					a[i] = a[i] + a[j + 1] - (a[j + 1] = a[i]);
				}
			}
		}
		return a;
	}
}
