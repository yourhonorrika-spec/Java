package Ch20;
//pg 872 Ex20.17
import java.util.*;

public class insertingSortedOrder {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Random random = new Random();

		for(int i = 0; i < 25; i++) {
			int num = random.nextInt(101);

			int index = 0;
			while(index < list.size() && list.get(index) < num) {
				index++;
			}
			list.add(index,num);
		}
		int sum =0;
		for(int num : list){
			sum += num;
		}
		double average = (double)sum/list.size();
		System.out.println("Sorted LinkedList: ");
		System.out.println(list);
		System.out.println("Sum: "+sum);
		System.out.println("Average: " + average);

	}
}