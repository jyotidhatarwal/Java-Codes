package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mainclass {

	
	
	
	
	public static void main(String[] args) {
		
//		Map<String,Integer> numbers = new HashMap<>();
//		
//		numbers.put("one", 1);
//		numbers.put("two", 2);
//		numbers.put("three", 3);
//		numbers.put("one", 10);
//		numbers.putIfAbsent("one", 5);
//		System.out.println(numbers.get("two"));
//		System.out.println(numbers.containsKey("four"));
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet());
//		System.out.println(numbers);
//		
//		for(Entry<String, Integer> entry: numbers.entrySet()) {
//			entry.setValue(entry.getValue()*100);
//		}
//		System.out.println(numbers);
		
		System.out.println(getHash("CAT"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i=0;i<s.length();i++) {
			hash += s.charAt(i);
		}
		return hash;
	}
}
