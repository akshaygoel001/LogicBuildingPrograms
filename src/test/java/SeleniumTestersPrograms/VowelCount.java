package SeleniumTestersPrograms;

import java.util.HashSet;
import java.util.Set;

public class VowelCount {
	public static void main(String[] args) {
		String s ="akshayi";
		char[] vowels= {'a','e','i','o','u'};
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<s.toCharArray().length;i++) {
			char character=s.charAt(i);
			for(int j=0;j<vowels.length;j++) {
				if(character==vowels[j]) {
					set.add(character);
				}
			}
		}
		System.out.println(set);
	}

}
