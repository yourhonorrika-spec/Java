package Chapter20;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReversedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Character> list1 = new LinkedList<Character>();
		
		for(char ch='A'; ch<='J'; ch++) {
			list1.add(ch);
		}
		
		System.out.println("Origianl List: "+  list1);
		
		List <Character> list2 = new LinkedList<Character>();
		ListIterator<Character> iterator = list1.listIterator(list1.size());
		while (iterator.hasPrevious()) {
			list2.add(iterator.previous());
		}
		
		System.out.println("Copy and Reversed List: " + list2);
		
		
		
		
	}

}
