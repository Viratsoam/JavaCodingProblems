package RecursionProblem;

public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,8,1,8,8,7};
		int si=0;
		int data =8;
		System.out.println(CheckLast(a,si,data));
	}
public static int CheckLast(int a[],int si,int data)
{
	if(si==a.length)
	{
		return -1;
	}
	
	int index = CheckLast(a,si+1,data);
	if(index==-1)
	{
		if(a[si]==data)
		{
			return si;
		}else
		{
			return -1;
		}
	}
	else
	{
		return index;
	}
}
}
