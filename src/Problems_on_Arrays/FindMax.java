package Problems_on_Arrays;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int a[]= new int[n];
for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
}
int max = 0;
for(int i=0;i<a.length;i++)
{
	if(max<a[i])
	{
		max = a[i];
	}
}
System.out.print(max);
	}

}
