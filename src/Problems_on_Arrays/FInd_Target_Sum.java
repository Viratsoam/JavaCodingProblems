package Problems_on_Arrays;

public class FInd_Target_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 103;
		int sum1 = 0;
		int i;
		for (i = 0; i < a.length; i++) {
			sum1 = a[i];
			for (int j = i + 1; j <= a.length; j++) {
				if (sum1 == sum) {
					int p = j - 1;
					System.out.println(i + " " + j);
				}
				if (sum1 > sum || j == a.length)
					break;
				sum1 = sum1 + a[j];
			}
			if(sum1 != sum && i==a.length-1)
			{
			System.out.println("Not found");
			}
		}
		
	}
}
