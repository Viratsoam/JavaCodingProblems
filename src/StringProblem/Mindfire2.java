package StringProblem;

public class Mindfire2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "12_13_14_15,16_17_18_19,21_22_23_24,25_26_27_28,30_31_32_33";
		/*
		 Input:
		 String str = "12_13_14_15,16_17_18_19,21_22_23_24,25_26_27_28,30_31_32_33";
		 
		 output:
		 	12 13 14 15
		 	16 17 "18" 19
		 	21 "22" 23 24
		 	25 26 27 28
		 	
		 */
			
		test(str);
	}
public static void test(String str)
{		
			int slsh = 0;
			int com = 0;
			String position ="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '_' )
			{
				slsh++;
			}
			if(str.charAt(i)==',')
			{
				position = position + i +" ";
				com++;
			}
		}
		
		System.out.println(slsh);
		System.out.println(com++);
		System.out.print(position);
}
}
