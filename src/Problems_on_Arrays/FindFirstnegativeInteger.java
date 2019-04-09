package Problems_on_Arrays;

public class FindFirstnegativeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,-1,-7,8,-15,30,16,28,-3};
		int k = 3;
		int ans[] = find(a,k);
		for(int val:ans)
		{
			System.out.print(val +" ");
		}
	}
public static int[] find(int a[],int k)
{
	//System.out.println(a.length);
	int ans[] =new int[a.length-k+1];
	int p= 0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i;j<k;j++)
		{
			if(a[j]<0)
			{
				ans[p]=a[j];
				p++;
				break;
			}
			if(j==k)
			{
				ans[p]=0;
				p++;
				break;
			}		
		}
		k = k + 1;
		if(i+3>=a.length)
		{
			break;
		}
		
	}
	return ans;
}
}
