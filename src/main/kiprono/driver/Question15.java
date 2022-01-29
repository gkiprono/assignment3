package main.kiprono.driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* Author: Gabriel Kiprono
 * Question 15
 * 
 * */

public class Question15 {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,10));
		HashMap<String, String> stringMap = new HashMap<>();
		
		stringMap.put("a", "1");
		stringMap.put("b", "2");
		stringMap.put("c", "10");
		
		List<Integer> results = new ArrayList<>();
		
		for(int i : integerList) {
			if(!(stringMap.containsValue(String.valueOf(i)))) {
				results.add(i);
			}
		}
		
		System.out.println(results.toString());
	}

}
