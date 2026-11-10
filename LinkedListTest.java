package Ch20;
//pg 837
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		String[] color1 = {"black","yellow","green","blue","violet","silver"};
		List<String> list1 = new LinkedList<String>();
		for(String color: color1)
			list1.add(color);
		
		String[] color2 = {"gold","white","brown","blue","gray","silver"};
		List<String> list2 = new LinkedList<String>();
		for(String color: color2)
			list2.add(color);
		
		list1.addAll(list2);
		list2 = null;
		printList(list1);
		
		convertToUpperCase(list1);
		printList(list1);
		System.out.print("\nDeleting elements 4 to 6...");
		removeList(list1,4,7);
		printList(list1);
		
		}

	private static void convertToUpperCase(List<String> list1) {
		// TODO Auto-generated method stub
		ListIterator<String> iterator = list1.listIterator();
		while(iterator.hasNext()) {
		String color = iterator.next();
		iterator.set(color.toUpperCase());
	}
	}

	private static void removeList(List<String> list1, int i, int j) {
		// TODO Auto-generated method stub
		list1.subList(i, j).clear();
	}

	private static void printList(List<String> list1) {
		// TODO Auto-generated method stub
		System.out.println("\nlist: ");
		for(String color: list1)
			System.out.printf("%s ", color);
		System.out.println();
		
		
		
	}
}