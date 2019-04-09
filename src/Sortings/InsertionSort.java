package Sortings;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 10, 9, 34, 21, 13, 11, 24, 32, 43, 44 };
		InSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void InSort(int a[]) {
		for (int i = 1; i < a.length - 1; i++) {
			int val = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > val) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = val;
		}
	}
}
