package SeleniumTestersPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

public class CharacterFrequency {
  	public static void main(String[] args) {
    String s="TTere aaa some myths related to Dragon fruits";
		List<String> list=new ArrayList<String>();
		HashSet<Character> set = new HashSet<>();
		String[] arr=new String[s.length()];
		int counter;
		arr=s.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=" ") {
				count++;
			}
		}
		System.out.println("Number of words :"+count);
		Hashtable<Character,Integer> table=new Hashtable<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		char[] arr1=s.toCharArray();
		
		for(int i=0;i<arr1.length;i++) {
			counter=1;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j] && arr1[j]!='0' ) {
					counter++;
					arr1[j]='0';
				}
			}
			if(arr1[i]!='0' && arr1[i]!=' ') {
				table.put(arr1[i], counter);
			}
		}
		System.out.println(table);

    }

}
