package RecursionProblem;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int col = 1;
		patt(n,row,col);
	}
public static void patt(int n, int row,int col)
{
	if(row==n)
	{
		return;
	}
 patt(n,row+1,col);
 while(row>=col)
 {
	 System.out.print("*");
	 row--;
 }
 System.out.println();
}
}
