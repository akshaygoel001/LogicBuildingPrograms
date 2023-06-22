package StringRelatesPrograms;

import java.util.ArrayList;
import java.util.List;

public class SubStringWithSameStartAndEnd {
	
	public static void main(String[] args) {
		String s="abcabc";
		List<String> arr=new ArrayList<String>();
		
		for (int i = 0; i < s.length() ; i++) {
			for(int j=i+1;j<=s.length();j++) {
				//System.out.println("i:"+i+" , j:"+j);
				//System.out.println(s.substring(i, j));
				arr.add(s.substring(i, j));
			}
		}
		//System.out.println(arr);
		//System.out.println(arr.get(3).length());
		int count=0;
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i).charAt(0)==arr.get(i).charAt(arr.get(i).length()-1) ) {
				count++;
			}
			
		}
		System.out.println(count);
		
		
		
	}

}
