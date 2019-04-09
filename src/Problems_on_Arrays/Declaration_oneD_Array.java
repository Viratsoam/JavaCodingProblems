package Problems_on_Arrays;

public class Declaration_oneD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = null; // Initialization of an array -> this is inside the Stack Memory
		a= new int[6]; // Declaration of an Array -> this is inside the Heap Memory
		// it will return the value from RSH to LHS and it's return the base Address of the RHS
		// which is treat as the value for the LHS.
		//  int a[](LHS) = new int[6];(RHS)
		
		for(int val: a)
		{
			System.out.println(val);
		}
	}

}
