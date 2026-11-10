  package Ch20;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//exercise 20.13  pg: 872
  public class DuplicationElimination {

  	public static void main(String[] args) {
  		Scanner input = new Scanner(System.in);
  		Set<String> names = new HashSet<String>();
  		System.out.println("How many names you'd like to type: ");
  		int count = input.nextInt();
  		for(int i = 0; i< count ; i++) {
  			System.out.println("Enter your first name: ");
  			String name = input.next();
  			names.add(name);
  		}
  		System.out.println("Unique First Names: ");
  		for(String uniqueName: names) 
  		System.out.println(uniqueName);
  		
  		System.out.println("Enter name to search: ");
  		String search = input.next();
  		if(names.contains(search)) {
  			System.out.println(search + " found.");
  		}else 
  			System.out.println(search + " is not found.");
  	}
  	
  }
