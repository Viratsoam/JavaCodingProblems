package BasicInterviewProblem;

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 2;
		System.out.println(result(n,k));
		
		// In a circle find safest person!
	}
public static int result(int n,int k)
{
	if(n==1)
	{
		return 1;
	}
	else
	{
		return (result(n-1,k)+k-1)%n+1;
	}
}
}
