package Sortings;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10,20,30,40,50,5,15,30,45,60,70,80};
		int lo = 0;
		int hi = a.length-1;
		
		int ans[] = mergesort(a,lo,hi);
		for(int val:ans)
		{
			System.out.print(val +" ");
		}

	}

	public static int[] mergetwoSortedarrays(int one[], int two[]) {
		int[] merged = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {
				merged[k] = one[i];
				i++;
				k++;
			} else {
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				merged[k] = two[j];
				j++;
				k++;
			}
		}
		if(j == two.length)
		{
			while(i <one.length)
			{
				merged[k] = one[i];
				i++;
				k++;
			}
		}
		return merged;
	}
	
	public static int[] mergesort(int a[],int lo, int hi)
	{
		if(lo==hi)
		{
			int[] base = new int[1];
			base[0] = a[lo];
			return base;
		}
		int mid = (lo+hi)/2;
		int[] fh = mergesort(a,lo,mid);
		int[] sh = mergesort(a,mid+1,hi);
		int ans[] = mergetwoSortedarrays(fh,sh);
		return ans;
		
	}
}
