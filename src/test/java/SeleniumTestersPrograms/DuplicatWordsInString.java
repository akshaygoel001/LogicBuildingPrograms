package SeleniumTestersPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatWordsInString {
	
	public static void main(String[] args) {
		String s="And then press F5 key to run this code, all the duplicate sentences are highlighted at once, the first displayed duplicate paragraphs are highlighted with green color, and other duplicates are highlighted with yellow color, see screenshot";
		List<String> list=new ArrayList<String>();
		String[] arr=new String[s.length()];
		arr=s.replace(".","").split(" ");
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			//System.out.println(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				if(word.equalsIgnoreCase(arr[j])) {
					list.add(word.toUpperCase());
					//System.out.println("word ="+word+" , at position ="+i+" ,and at ="+j);
				}
			}
		}
		Collections.sort(list);
		Set<String> set=new HashSet<String>(list);
		System.out.println(set.size());
		System.out.println(set);
		
	}
	

}
