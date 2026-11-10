package Ch20;
//pg 835
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		String[] colors = {"MAGENTA","RED","WHITE","BLUE","CYAN"};
		List<String> list = new ArrayList<String>();
		for(String color: colors)
			list.add(color);
		System.out.println("ArrayList: ");
		for(int count = 0; count < list.size(); count++)
			System.out.printf("%s ",list.get(count));
		String[] removeColors = {"RED","WHITE","BLUE"};
		List<String> removeList = new ArrayList<String>();
		
		for (String color: removeColors)
					removeList.add(color);
		removeColors(list,removeList);
		System.out.println();
		System.out.println("ArrayList after calling removeColors: ");
		for(String color: list)
		System.out.printf("%s ",color);
				

		
		
	}

	private static void removeColors(Collection <String> collection1, Collection<String>collection2) {
		Iterator<String> iterator = collection1.iterator();
		while(iterator.hasNext()){
				if(collection2.contains(iterator.next()))
						iterator.remove();
		}
		// TODO Auto-generated method stub
		
	}
	}

		
	
	