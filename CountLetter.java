package Ch20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//pg872 Ex20.14

public class CountLetter{
	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("Enter sentence: ");
	String s = in.nextLine();
	Map<Character,Integer> map= new HashMap<Character,Integer>();
	for(int i=0; i< s.length();i++) {
		char ch= s.charAt(i);
		s= s.toLowerCase();
	if(Character.isLetter(ch)) {
		if(map.containsKey(ch))
			map.put(ch,map.get(ch)+1);
		else
			map.put(ch, 1);
		
	}
		
	}
	System.out.println("Letter count: ");
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
	System.out.println(entry.getKey()+" " +entry.getValue());
	}
	}
}
