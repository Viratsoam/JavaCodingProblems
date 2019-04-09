package Problems_on_Arrays;

public class WavePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };
		print(a);
	}

	public static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
				if(i%2==0)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j] +" ");
					}
				}
				else
				{
					for(int j=a[i].length-1;j>=0;j--)
					{
						System.out.print(a[i][j]+" ");
					}
				}
		}
	}
}