package Lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List <String>fruits = new ArrayList();
		List<String>vegetables = new ArrayList();
	
		fruits.add("Apple");
//		//fruits.add(23);
		fruits.add("Orange");
		fruits.add("mango");
		
		vegetables.add("potato");
		vegetables.add("tomato");
		vegetables.add("carrot");
		
		fruits.addAll(vegetables);
		
		
		
		System.out.println(fruits);
		System.out.println(fruits.get(5));
		
		fruits.set(0, "banana");
		System.out.println(fruits.size());
		
		System.out.println(fruits);
		
		List<String> toremove = new ArrayList<>();
		toremove.add("banana");
		toremove.add("mango");
		fruits.removeAll(toremove);
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		String x[] = new String[fruits.size()];
		
		fruits.toArray(x);
		
		for(String e:x) {
			System.out.println(e);
		}
	
		
		ArrayList <Integer> marks = new ArrayList<>();
		marks.add(2);
		
		System.out.println(marks);

//		
	//Pair <X ,Y> P = new Pair("Anuj , 200");
//		P.getDescription();
	}

}
