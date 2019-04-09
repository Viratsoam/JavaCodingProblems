package Sortings;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 12, 10, 9, 34, 21, 13, 11, 24, 32, 43, 44 };
		Ssort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static int[] Ssort(int a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}
}
