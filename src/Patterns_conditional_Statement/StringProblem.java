package Patterns_conditional_Statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);

		String str[] = { "10", "20", "Rajai", "Odisha", "Berhampur", "90" };
		String str1 = "";
		String s = "";
		for (int i = 0; i < str.length; i++) {
			str1 = str1 + str[i] + " ";
		}
		int sum =0;
		str1 = str1.replaceAll("[^-?0-9]+"," "); 
		List<String> al = Arrays.asList(str1.trim().split(" "));
		Object[] a = al.toArray(); 
		Integer[] intarray=new Integer[a.length];
	       for(int i=0;i<a.length;i++)
	       {
	           intarray[i]=Integer.parseInt((String) a[i]);
	       }
	       for(Integer temp:intarray)
	       {
	           sum = sum + temp;
	       }
	       System.out.println(sum);
	}

}
