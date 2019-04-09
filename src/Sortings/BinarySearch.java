package Sortings;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
		System.out.println(BN(a, n));
	}

	public static int BN(int a[], int n) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (a[mid] < n) {
				lo = mid + 1;
			} else if (a[mid] > n) {
				hi = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
