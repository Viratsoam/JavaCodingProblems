package BasicInterviewProblem;

import java.util.ArrayList;
import java.util.HashMap;

public class Find_Max_Same_length_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "this_is_visit_to_city_visit_india";
		find(str);
	}

	public static void find(String str) {
		HashMap<String, Integer> cc = new HashMap<>();
		ArrayList<String> add = new ArrayList<>();
		String s = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)!='_')
			s = s + str.charAt(i);
			if (str.charAt(i) == '_') {
				add.add(s);
				int len = s.length();
				if(!cc.containsKey(s)) {
					cc.put(s,len);
				}
				s = "";
			}
		}
		int sum = 0;
		ArrayList<Integer> num = new ArrayList<>();
		for(int output : num)
		{
			
		}
	}
}
