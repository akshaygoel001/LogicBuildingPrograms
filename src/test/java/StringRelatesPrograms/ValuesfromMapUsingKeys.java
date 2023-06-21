package StringRelatesPrograms;

import java.util.HashMap;

public class ValuesfromMapUsingKeys {

	public static void main(String[] args) {
		
		HashMap<String,Integer> arr=new HashMap<String, Integer>();
		
		arr.put("a", 2);
		arr.put("b", 3);
		arr.put("c", 4);
		arr.put("d", 5);
		
		System.out.println(arr.get("a"));
		
	}
}
