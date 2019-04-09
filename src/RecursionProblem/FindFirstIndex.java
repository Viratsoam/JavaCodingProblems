package RecursionProblem;

public class FindFirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,8,1,1,8,3,4};
		int si = 0;
		int data = 6;
		System.out.println(search(a,si,data));
	}
	public static int search(int a[], int si,int data)
	{
		if(si==a.length-1)
		{
			return -1;
		}
		if(a[si]==data)
		{	 
			return si;
		}else
		{
		int ans=search(a,si+1,data);
		return ans;
		}
	}
}
